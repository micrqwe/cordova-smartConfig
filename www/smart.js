/*global cordova, module*/
var exec = require('cordova/exec');
module.exports = {
    hello: function (paymentInfo, successCallback, errorCallback) {
       exec(successCallback, errorCallback, "smart", "hello", [paymentInfo]);
    }
};
