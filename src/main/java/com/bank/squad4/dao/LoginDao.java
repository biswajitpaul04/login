package com.bank.squad4.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.squad4.model.Customer;
import com.bank.squad4.repository.LoginRepository;

@Repository
public interface LoginDao extends LoginRepository {
	Customer findByCustomerNameAndPassword( @Param("customerName") String customerName, @Param("password") String password);
}
