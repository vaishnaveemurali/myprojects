const Order = require('../models/order.model');

//Simple version, without validation or sanitation
exports.test = function (req, res) {
    res.send('Greetings from the Test controller!');
};

// controllers/orders.js
exports.order_create = function (req, res) {
    let order = new Order(
        {
            name: req.body.name,
            custid: req.body.custid
        }
    );

    order.save(function (err) {
        if (err) {
            return next(err);
        }
        res.send('Order Created successfully')
    })
};

//Read
exports.order_details = function (req, res) {
    Order.findById(req.params.id, function (err, order) {
        if (err) return next(err);
        res.send(order);
    })
};

//delete
exports.order_delete = function (req, res) {
    Order.findByIdAndRemove(req.params.id, function (err) {
        if (err) return next(err);
        res.send('Deleted successfully!');
    })
};