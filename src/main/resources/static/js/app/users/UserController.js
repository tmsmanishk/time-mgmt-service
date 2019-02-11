'use strict'

var module = angular.module('tmApp.controllers', []);
module.controller("UserController", [ "$scope", "UserService",
		function($scope, UserService) {
			$scope.user = [];
			
			/*UserService.getUserById(1).then(function(value) {
				console.log(value.data);
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
            });*/
            
            // fuelux wizard
            var wizard = $('.wizard').wizard();
            
            wizard.on('finished', function (e, data) {
                UserService.saveUser($scope.user).then(function(response) {
                    console.log("works");
                    if(response = "SUCCESS"){
                        $.smallBox({
                            title: "Congratulations! New user: " + $scope.user.username + " has been successfully created.",
                            content: "<i class='fa fa-clock-o'></i> <i>1 seconds ago...</i>",
                            color: "#5F895F",
                            iconSmall: "fa fa-check bounce animated",
                            timeout: 3000
                        });
                    }else if(response = "ALREAY_EXIST"){
                         $.smallBox({
                            title: "Sign In! User: " + $scope.user.username + " alreday exist.",
                            content: "<i class='fa fa-warning'></i> <i>1 seconds ago...</i>",
                            color: "#89825e",
                            iconSmall: "fa fa-check bounce animated",
                            timeout: 3000
                        });
                    }else{
                        $.smallBox({
                            title: "Oops! Something went wrong. Please contact your program manager.",
                            content: "<i class='fa fa-times'></i> <i>1 seconds ago...</i>",
                            color: "#895e5e",
                            iconSmall: "fa fa-check bounce animated",
                            timeout: 3000
                        });
                    }
				}, function(reason) {
					console.log("error occured:" + reason);
				}, function(value) {
					console.log("no callback: " + value);
				});
           
            
            });

            $scope.getAllUsers = function(){
                
            };

            
			
		} ]);