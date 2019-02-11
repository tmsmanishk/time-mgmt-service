package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.UserDetailsDto;

/**
 * Created by ashish on 13/5/17.
 */
public interface UserService {
	UserDetailsDto getUserById(String userId);
	
	UserDetailsDto getUserByUsername(String userName);
    
	void saveUser(UserDetailsDto userDetailsDto);
    
	Long getLastId();
    
	List<UserDetailsDto> getAllUsers();
}
