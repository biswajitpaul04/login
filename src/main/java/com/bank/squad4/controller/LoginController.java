package com.bank.squad4.controller;



import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.squad4.model.Customer;
import com.bank.squad4.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping("/login")
    public Customer loginUser(@Validated @RequestBody Customer customer) {
		return service.checkLogin(customer);

    }
    
}
