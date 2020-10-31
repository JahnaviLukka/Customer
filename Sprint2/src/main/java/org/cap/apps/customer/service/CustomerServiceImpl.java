package org.cap.apps.customer.service;

import org.cap.apps.customer.dao.*;
import org.cap.apps.customer.entities.Customer;
import org.cap.apps.customer.util.ValidationUtil;
import org.cap.apps.customer.service.CustomerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService{

	private static final Logger Log= LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private ICustomerDao dao;
	
	@Override
	public Customer register(Customer customer) {
		Log.info("Registration of Customer");
	  ValidationUtil.checkArgumentNotNull(customer);
	  ValidationUtil.checkName(customer.getName()); 
	  customer=	dao.add(customer);
	   return customer;
	}

	@Override
	public Customer updateName(long id,String name) {
		Log.info("Customer Value  updated here");
		Customer customer=dao.findById(id);
		ValidationUtil.checkName(customer.getName());
		customer.setName(name);
		return customer;
	}

}
