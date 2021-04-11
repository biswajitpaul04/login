package com.bank.squad4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "customer_id")
	@NotEmpty(message = "Customer Name not be empty")
	private Long customerId = 0l;
	
	@Column(name = "customer_name")
	@NotEmpty(message = "Customer Name not be empty")
	private String customerName;
	
	@Column(name = "password")
	@NotEmpty(message = "Password may not be empty")
	private String password;
	
	@Transient
	private int statusCode;
	
	@Transient
	private String message;

}
