'use strict'

angular.module('tmApp.services', []).factory('UserService',
[ "$http", "CONSTANTS", function($http, CONSTANTS) {
    var service = {};
    service.getUserById = function(userId) {
        var url = CONSTANTS.getUserByIdUrl + userId;
        return $http.get(url);
    }
    service.getAllUsers = function() {
        return $http.get(CONSTANTS.getAllUsers);
    }
    service.saveUser = function(user) {
        return $http.post(CONSTANTS.saveUser, user);
    }
    return service;
} ]);