package com.example.ContactUs.Service.Impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.ContactUs.Models.UserDetails;
import com.example.ContactUs.Models.UserDetailsDto;
import com.example.ContactUs.Service.ContactusDetailsService;
import com.example.ContactUs.repository.ContactUsDetailsRepository;

@Service
public class ContactusDetailsServiceImpl implements ContactusDetailsService {
	
	  @Autowired
	    private ContactUsDetailsRepository userRepository;
	
	  @Override
	  public UserDetails save(UserDetailsDto registration){
		  UserDetails user = new UserDetails();
	        user.setFirstName(registration.getFirstName());
	        user.setLastName(registration.getLastName());
	        user.setEmail(registration.getEmail());
	        user.setPhonenumber(registration.getPhonenumber());
	        user.setYourmessage(registration.getYourmessage());
	        
	        return userRepository.save(user);
	    }

	




	
	
}
