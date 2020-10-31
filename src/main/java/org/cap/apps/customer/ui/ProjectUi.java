package org.cap.apps.customer.ui;

import org.cap.apps.customer.entities.Customer;
import org.cap.apps.customer.exceptions.CustomerNotFoundException;
import org.cap.apps.customer.exceptions.InvalidCustomerNameException;
import org.cap.apps.customer.service.CustomerServiceImpl;
import org.cap.apps.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service ;

	public void runUi() {
		try {
			
		
		Customer customer1 = add("Name1");
		long id1 = customer1.getId();
		Customer customer2 = add("Name2");
		long id2 = customer2.getId();
		Customer customer3 = add("Name3");
		long id3 = customer3.getId();
		customer2=updateName(id2, "Name4");
		}
		catch (CustomerNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (InvalidCustomerNameException e){
            System.out.println(e.getMessage());
        }
		
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
