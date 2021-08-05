package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);
	void delete(Customer customer);
	void Update(Customer customer);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List<Customer>getAll();
}
