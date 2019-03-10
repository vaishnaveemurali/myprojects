// app.js
const express = require('express');
const bodyParser = require('body-parser');

const order = require('./routes/order.route'); // Imports routes for the products
const app = express();


// Set up mongoose connection
const mongoose = require('mongoose');
let dev_db_url = 'mongodb+srv://admin:admin123@cluster2-gv5o2.mongodb.net/mydb';
let mongoDB = process.env.MONGODB_URI || dev_db_url;
mongoose.connect(mongoDB);
mongoose.Promise = global.Promise;
let db = mongoose.connection;
db.on('error', console.error.bind(console, 'MongoDB connection error:'));

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: false}));
app.use('/orders', order);

let port = 9090;

app.use(express.static('public'))

app.listen(port, () => {
    console.log('Server is up and running on port numner ' + port);
});