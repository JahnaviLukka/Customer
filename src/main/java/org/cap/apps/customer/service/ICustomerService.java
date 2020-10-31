package org.cap.apps.customer.service;

import org.cap.apps.customer.entities.Customer;

public interface ICustomerService {

    Customer register(Customer customer);
	
	Customer updateName(long id,String name);
	
}
