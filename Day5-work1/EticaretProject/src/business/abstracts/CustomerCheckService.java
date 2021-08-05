package business.abstracts;

import entities.concretes.Customer;

public interface CustomerCheckService {

	boolean checkIfFirstName(Customer customer);
	boolean checkIfLastName(Customer customer);
	boolean checkIfPassword(Customer customer);
	boolean checkIfEmail(Customer customer);
	boolean checkIfUnique(Customer customer);
	boolean checkIsValid(Customer customer);
	
}
