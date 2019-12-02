package com.example.ContactUs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ContactUs.Models.UserDetails;


	@Repository
	public interface ContactUsDetailsRepository extends JpaRepository<UserDetails, Long> {

	    UserDetails findByEmail(String email);
}
