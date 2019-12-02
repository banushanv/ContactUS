package com.example.ContactUs.Service;




import org.springframework.stereotype.Service;

import com.example.ContactUs.Models.UserDetails;
import com.example.ContactUs.Models.UserDetailsDto;


@Service
public interface ContactusDetailsService{
 UserDetails save(UserDetailsDto registration);
}
