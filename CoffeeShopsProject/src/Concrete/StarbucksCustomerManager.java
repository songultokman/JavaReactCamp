package Concrete;

import Abstract.CustomerCheckService;
import java.rmi.RemoteException;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer)  throws NumberFormatException, RemoteException {
		if(customerCheckService.CheckIfRealPerson(customer))
		 {
			super.save(customer);
		 
		 }else
			 System.out.println("Not a valid person");
		
	}

   
}