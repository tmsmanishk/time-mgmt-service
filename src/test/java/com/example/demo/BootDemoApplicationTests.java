package com.example.demo;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.cons.AccessEnum;
import com.example.demo.cons.IsActiveEnum;
import com.example.demo.dto.UserDetailsDto;
import com.example.demo.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoApplicationTests {

	@Autowired
	UserService userService;
	
	@Test
	public void getById() {
		UserDetailsDto userDetailsDto = userService.getUserById("U-0");
		System.out.println("UserId: " + userDetailsDto.getUserId());
	}
	
	@Test
	public void getLastId(){
		Long lastId = userService.getLastId();
		System.out.println("Last Id was : " + lastId);
	}
	
	@Test
	public void saveUser(){
		UserDetailsDto dto = new UserDetailsDto();
		dto.setUserId("U2");
		dto.setFirstName("Manish");
		dto.setLastName("Kumar");
		dto.setDesignation("Co-founder");
		dto.setGender("Male");
		dto.setEmail("anilk@gmail.com");
		dto.setCountry("India");
		dto.setIsActive(IsActiveEnum.YES.toString());
		dto.setAccessCodes(AccessEnum.SUPERUSER.toString());
		dto.setUsername("anilk");
		dto.setPassword("anilk");
		
		userService.saveUser(dto);
	}
	
	@Test
	public void getAllUsers(){
		List<UserDetailsDto> listOfUserDetailsDto = userService.getAllUsers();
		System.out.println("List Of User Details Dtos: " + listOfUserDetailsDto.size());
	}

}
