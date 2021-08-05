package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {

	void signIn(Customer customer);
	void signUp(Customer customer);
}
