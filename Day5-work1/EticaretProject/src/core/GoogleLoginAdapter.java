package core;

import entities.concretes.Customer;
import google.GoogleLogin;

public class GoogleLoginAdapter implements GoogleService{
    
	//external integration is done in this part  
	@Override
	public void loginViaGoogle(Customer customer) {
		
		GoogleLogin googleLogin=new GoogleLogin();
		googleLogin.Login(customer);
		
	}

}
