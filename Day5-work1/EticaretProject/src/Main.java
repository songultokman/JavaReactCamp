
import business.concretes.CustomerCheckManager;
import business.concretes.CustomerManager;
import business.concretes.MailVerificationLink;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
	
		
		Customer customer1=new Customer(1,"Songül", "Tokman", "123456","songul@gmail.com");
		Customer customer2=new Customer(2,"Esra", "Karden", "789488","esra@gmail.com");
		Customer customer3=new Customer(3,"Betül", "Ak", "1456236","betul@gmail.com");
		
		
		CustomerManager customerManager=new CustomerManager(new CustomerCheckManager(), new MailVerificationLink(),new HibernateCustomerDao());
		customerManager.signUp(customer1);
		customerManager.signUp(customer2);
		
		
		
		
	}

}
