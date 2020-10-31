package org.cap.apps.customer.dao;

import org.cap.apps.customer.entities.Customer;

public interface ICustomerDao {
	Customer add(Customer customer);
	
	Customer update(Customer customer);
	
	Customer findById(long id);

}
