package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	List<String> emails=new ArrayList<String>();
	
	@Override
	public boolean checkIfFirstName(Customer customer) {
		if(customer.getFirstName().isEmpty()) {
			System.out.println("Please, this field cannot left blank!");
			return false;
			
		}else if(customer.getFirstName().length()<2) {
			System.out.println("Your name must be at least two caracter"+ customer.getFirstName().length() );
			return false;
		}
			return true;
	}

	@Override
	public boolean checkIfLastName(Customer customer) {
		if(customer.getLastName().isEmpty()) {
			System.out.println("Please, this field cannot left blank! ");
			return false;
		}else if(customer.getLastName().length()<2) {
			System.out.println("Your password must be at least two caracter");
			return false;
		}
			return true;
	}

	@Override
	public boolean checkIfPassword(Customer customer) {
		if(customer.getPassword().isEmpty()) {
			System.out.println("Please, this field cannot left blank! ");
			return false;
			
		}else if(customer.getPassword().length()<6) {
			System.out.println("Your password must be at least six caracter");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean checkIfEmail(Customer customer) {
		
		String regex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2,})?$";
		Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE );
		
		if(customer.getEmail().isEmpty()) {
			System.out.println("Please, this field cannot left blank! ");
			
		}else if(pattern.matcher(customer.getEmail()).find()==false) {
			System.out.println("This email format isn't suitable for the format. Please enter correct format. Example:abc@agd.com ");
			return false;
		  } 
		
		return true;
	}

	@Override
	public boolean checkIfUnique(Customer customer) {
		
		if(emails.contains(customer.getEmail())) {
			System.out.println("This email valid. Please try different email ");
			return false;
		}else {
			emails.add(customer.getEmail());
			return true;
		}
		
	}

	@Override
	public boolean checkIsValid(Customer customer) {
		if(checkIfFirstName(customer) && checkIfLastName(customer) && checkIfPassword(customer) && checkIfEmail(customer)&& 
				checkIfUnique(customer)==true) {
			 return true;
		}
		    return false;
	}
}


