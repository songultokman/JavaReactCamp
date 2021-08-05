package business.abstracts;



public interface MailVerificationLinkService {

	void sendMail(String mail);
	void verifyMail(String mail);
	boolean isVerificated(String mail);
	
}
