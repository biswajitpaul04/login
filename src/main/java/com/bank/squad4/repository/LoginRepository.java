package com.bank.squad4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.bank.squad4.model.Customer;

public interface LoginRepository extends JpaRepository<Customer, Long> {
	public Customer findByCustomerNameAndPassword(String customerName, String password);
}