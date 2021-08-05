package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.CustomerCheckService;
import business.concretes.CustomerCheckManager;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

   
public class HibernateCustomerDao implements CustomerDao{

	List<Customer> customers=new ArrayList<Customer>();
	
	
	@Override
	public void add(Customer customer) {
		//customers.add(customer);
		System.out.println(customer.getFirstName() + " user saved the system succesfully");
		
		
		}

	@Override
	public void delete(Customer customer) {
		System.out.println("Customer removed" + customer.getFirstName());
		customers.remove(customer);
		
	}

	@Override
	public void Update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAll() {
		
		return null;
	}
	@Override
	public boolean getEmail(String email) {
		for(Customer customer: customers)
		{
			if(customer.getEmail()==email)
				 return true;
		}	
		return false;
	}
	@Override
	public boolean getPassword(String password) {
		
		for(Customer customer: customers)
		{
			if(customer.getPassword()==password)
				 return true;
		}	
		return false;
	}

	
		
		
	

	
}
