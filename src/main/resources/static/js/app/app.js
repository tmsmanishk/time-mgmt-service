'use strict'

var tmApp = angular.module('tmApp', [ 'ui.bootstrap', 'tmApp.controllers',
		'tmApp.services' ]);
tmApp.constant("CONSTANTS", {
	getUserByIdUrl : "/user/getUser/",
	getAllUsers : "/user/getAllUsers",
	saveUser : "/user/saveUser"
});