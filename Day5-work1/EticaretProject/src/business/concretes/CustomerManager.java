package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import business.abstracts.MailVerificationLinkService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;



public class CustomerManager implements CustomerService {

	CustomerDao customerDao;
	CustomerCheckService customerService;
	MailVerificationLinkService mailVerification;
	
	
	public CustomerManager(CustomerCheckService customerService,
			 				MailVerificationLinkService mailVerification,
			 				CustomerDao customerDao ) {
		this.customerService=customerService;
		this.mailVerification=mailVerification;
		this.customerDao=customerDao;
	}
	
	// User signIn the system
	@Override
	public void signIn(Customer customer) {
		
		mailVerification.verifyMail(customer.getEmail()); // This part is simulation
		
		if(customerDao.getEmail(customer.getEmail()) && customerDao.getPassword(customer.getEmail())&& 
				mailVerification.isVerificated(customer.getEmail()) == true) {
			
				System.out.println("Congratulations " + customer.getFirstName() +  " logged the system");}
		
			 else if(mailVerification.isVerificated(customer.getEmail())==false ) {
				System.out.println("User informations are correct, but please verify your mail"); }
		
			 else {
				 System.out.println("User information is false. Please check it");}
				
	}
				
	
	//User save the system
	@Override
	public void signUp(Customer customer) {
		if(customerService.checkIsValid(customer)==true) //If all information is correct isValid will run
		{
			customerDao.add(customer);
			mailVerification.sendMail(customer.getEmail());
		}
	}
	
	

	
	

	
}
