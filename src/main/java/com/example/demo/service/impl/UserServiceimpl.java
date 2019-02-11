package com.example.demo.service.impl;

import com.example.demo.cons.IDCodeEnum;
import com.example.demo.cons.IsActiveEnum;
import com.example.demo.converter.Converter;
import com.example.demo.dto.UserDetailsDto;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.service.UserService;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ashish on 13/5/17.
 */
@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserDetailsRepository userRepository;

	@Override
	public UserDetailsDto getUserById(String userId) {
		return Converter.entityToDto(userRepository.findByUserId(userId));
	}
	
	@Override
	public UserDetailsDto getUserByUsername(String userName) {
		return Converter.entityToDto(userRepository.findByUsername(userName));
	}

	@Override
	public void saveUser(UserDetailsDto userDetailsDto) {
		userDetailsDto.setUserId(IDCodeEnum.U.toString()+getLastId());
		userDetailsDto.setIsActive(IsActiveEnum.YES.toString());
		userRepository.save(Converter.dtoToEntity(userDetailsDto));
	}

	@Override
	public Long getLastId(){
		long lastId = 0;
		List<Long> listOfIds = userRepository.getLastId();
		for(Long id : listOfIds){
			lastId = id;
			break;
		}
		return lastId;
	}

	@Override
	public List<UserDetailsDto> getAllUsers() {		
		return userRepository.findAll().stream().map(Converter::entityToDto).collect(Collectors.toList());
	}
	
	
	
	/*@Override
	public List<UserDto> getAllUsers() {
		//return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
	}*/
}
