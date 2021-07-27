package Concrete;

import Entities.Customer;

import java.rmi.RemoteException;

import Abstract.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		System.out.println("Saved to db  "+ customer.getFirstName());
		
	}

}
