const express = require('express');
const router = express.Router();

const order_controller = require('../controllers/order.controller');


// a simple test url to check that all of our files are communicating correctly.
router.get('/test', order_controller.test);

router.post('/create', order_controller.order_create);
router.get('/:id', order_controller.order_details);
router.delete('/:id/delete', order_controller.order_delete);
module.exports = router;