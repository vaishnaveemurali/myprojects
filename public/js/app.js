angular
  .module('myapp', ['ui.router'])
  .config(BeanRouter)

BeanRouter.$inject = ['$stateProvider', '$urlRouterProvider']
function BeanRouter($stateProvider, $urlRouterProvider){

  // Front end routes using angular ui.router:
  $stateProvider
  .state('index', {
    url: '/',
    templateUrl: 'beans_templates/index.html'
  })
  .state('new', {
    url: '/new',
    templateUrl: 'beans_templates/new.html'
  })
  .state('show', {
    url: '/orders/:id',
    templateUrl: 'beans_templates/show.html'
  });

  // Default (fallback) route:
  $urlRouterProvider.otherwise('/')

}