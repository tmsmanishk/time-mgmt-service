package com.example.demo.converter;


import com.example.demo.dto.UserDetailsDto;
import com.example.demo.entity.UserDetails;

/**
 * Created by ashish on 13/5/17.
 */
public class Converter {
	public static UserDetails dtoToEntity(UserDetailsDto userDetailsDto) {
		UserDetails userDetails = new UserDetails();
		
		userDetails.setUserId(userDetailsDto.getUserId());
		userDetails.setFirstName(userDetailsDto.getFirstName());
		userDetails.setMiddleName(userDetailsDto.getMiddleName());
		userDetails.setLastName(userDetailsDto.getLastName());
		userDetails.setDesignation(userDetailsDto.getDesignation());
		userDetails.setDateOfBirth(userDetailsDto.getDateOfBirth());
		userDetails.setGender(userDetailsDto.getGender());
		userDetails.setEmail(userDetailsDto.getEmail());
		userDetails.setPhone(userDetailsDto.getPhone());
		userDetails.setMobile(userDetailsDto.getMobile());
		userDetails.setCompany(userDetailsDto.getCompany());
		userDetails.setCountry(userDetailsDto.getCountry());
		userDetails.setCity(userDetailsDto.getCity());
		userDetails.setPinCode(userDetailsDto.getPinCode());
		userDetails.setIsActive(userDetailsDto.getIsActive());
		userDetails.setAccessCodes(userDetailsDto.getAccessCodes());
		userDetails.setProfilePic(userDetailsDto.getProfilePic());
		userDetails.setAboutMe(userDetailsDto.getAboutMe());
		userDetails.setUsername(userDetailsDto.getUsername());
		userDetails.setPassword(userDetailsDto.getPassword());
		
		return userDetails;
	}

	public static UserDetailsDto entityToDto(UserDetails userDetails) {
		UserDetailsDto userDetailsDto = new UserDetailsDto();
		
		userDetailsDto.setUserId(userDetails.getUserId());
		userDetailsDto.setFirstName(userDetails.getFirstName());
		userDetailsDto.setMiddleName(userDetails.getMiddleName());
		userDetailsDto.setLastName(userDetails.getLastName());
		userDetailsDto.setDesignation(userDetails.getDesignation());
		userDetailsDto.setDateOfBirth(userDetails.getDateOfBirth());
		userDetailsDto.setGender(userDetails.getGender());
		userDetailsDto.setEmail(userDetails.getEmail());
		userDetailsDto.setPhone(userDetails.getPhone());
		userDetailsDto.setMobile(userDetails.getMobile());
		userDetailsDto.setCompany(userDetails.getCompany());
		userDetailsDto.setCountry(userDetails.getCountry());
		userDetailsDto.setCity(userDetails.getCity());
		userDetailsDto.setPinCode(userDetails.getPinCode());
		userDetailsDto.setIsActive(userDetails.getIsActive());
		userDetailsDto.setAccessCodes(userDetails.getAccessCodes());
		userDetailsDto.setProfilePic(userDetails.getProfilePic());
		userDetailsDto.setAboutMe(userDetails.getAboutMe());
		userDetailsDto.setUsername(userDetails.getUsername());
		userDetailsDto.setPassword(userDetails.getPassword());
		
		return userDetailsDto;
	}
}
