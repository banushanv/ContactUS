package com.example.ContactUs.Models;


import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;




public class UserDetailsDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;



    @Email
    @NotEmpty
    private String email;
    
    
   
    @NotEmpty
    private String phonenumber;
    
    @NotEmpty
    private String yourmessage;
    

    public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}



	





    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   



    public String getYourmessage() {
		return yourmessage;
	}

	public void setYourmessage(String yourmessage) {
		this.yourmessage = yourmessage;
	}

}