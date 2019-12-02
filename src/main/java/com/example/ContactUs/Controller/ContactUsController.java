package com.example.ContactUs.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ContactUs.Models.UserDetails;
import com.example.ContactUs.Models.UserDetailsDto;
import com.example.ContactUs.Service.ContactusDetailsService;





@RestController
@RequestMapping("/contactus")
public class ContactUsController {
 @Autowired
 private ContactusDetailsService contactusDetailsService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<UserDetails> create(@Valid @RequestBody UserDetailsDto user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(contactusDetailsService.save(user));
	}
	
	
	
}
