package org.cap.apps.customer.exceptions;

public class CustomerNotFoundException extends RuntimeException {
	
	public CustomerNotFoundException() {

	}

	public CustomerNotFoundException(String msg) {
		super(msg);
	}

}
