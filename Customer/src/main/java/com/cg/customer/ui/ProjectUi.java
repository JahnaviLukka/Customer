package com.cg.customer.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customer.entities.Customer;
import com.cg.customer.service.ICustomerService;
import com.cg.customer.service.CustomerServiceImpl;

@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service ;

	public void runUi() {
		Customer customer = add("Name1");
		long id1 = customer.getId();
		Customer customer2 = add("Name2");
		long id2 = customer2.getId();
		Customer customer3 = add("Name3");
		long id3 = customer3.getId();
		customer2=updateName(id2, "Name4");
		
	}


	public Customer add(String name) {
		Customer customer = new Customer(name);
		customer = service.register(customer);
		System.out.println("Customer  details, id=" + customer.getId() + " name=" + customer.getName());
		return customer;
	}
	public Customer updateName(long id,String name) {
		Customer customer = service.updateName(id,name);
		System.out.println("Customer  updated details, id=" + customer.getId() + " name=" + customer.getName());
		return customer;
	}
	}
