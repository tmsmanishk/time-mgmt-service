package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.UserDetailsDto;
import com.example.demo.service.UserService;
import com.example.demo.utils.Constants;

/**
 * Created by Manish Kumar
 */
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;

	/*@RequestMapping(Constants.GET_USER_BY_ID)
	public UserDto getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}*/
	
	@RequestMapping(value = Constants.GET_ALL_USERS, method = RequestMethod.GET)
	public @ResponseBody List<UserDetailsDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST, produces="application/json")
	public @ResponseBody String saveUser(@RequestBody UserDetailsDto userDetailsDto) {
		String status = Constants.OTHERS;
		UserDetailsDto userDto = userService.getUserByUsername(userDetailsDto.getUsername());
		
		if(userDto == null) {
			userService.saveUser(userDetailsDto);
			status = Constants.SUCCESS;
		}else{
			status = Constants.ALREAY_EXIST;
		}
		return status;		
	}
}
