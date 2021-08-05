package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.MailVerificationLinkService;


public class MailVerificationLink implements MailVerificationLinkService{

	List<String> verificatedEmails=new ArrayList<String>();
	@Override
	public void sendMail(String mail) {
		System.out.println("Mail verificaiton send to user");
		
	}

	@Override
	public void verifyMail(String mail) {
		System.out.println(mail +" Subscription completed");
		
	}

	@Override
	public boolean isVerificated(String mail) {
		if(verificatedEmails.contains(mail))
		{
			return true;
		}
		return false;
	}

}
