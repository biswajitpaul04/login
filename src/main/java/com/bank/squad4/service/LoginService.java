package com.bank.squad4.service;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.squad4.controller.LoginController;
import com.bank.squad4.dao.LoginDao;
import com.bank.squad4.model.Customer;

@Service
public class LoginService {
	@Autowired
	private LoginDao dao;

	private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(LoginController.class);
	
	public Customer checkLogin(Customer customer) {
		Customer cust = null;
		try {
			logger.info(String.format("Checking for Customer -  %s", customer.getCustomerName()));
			cust = dao.findByCustomerNameAndPassword(customer.getCustomerName(), customer.getPassword());
			if(null != cust 
					&& null != cust.getCustomerId()) {
				cust.setStatusCode(1);
			} else {
				cust = new Customer();
				cust.setStatusCode(0);
			}
		} catch (Exception e) {
			logger.info(String.format("Exception for Customer -  %s", e));
			cust = new Customer();
			cust.setStatusCode(2);
			cust.setMessage("Exception Occured during execution");
		}
		
		return cust;
	}
}
