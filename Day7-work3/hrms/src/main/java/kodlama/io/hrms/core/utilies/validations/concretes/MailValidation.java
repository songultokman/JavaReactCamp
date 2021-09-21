package kodlama.io.hrms.core.utilies.validations.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.core.utilies.validations.abstracts.MailValidationService;

@Service
public class MailValidation implements MailValidationService{

	public static boolean checkEmailDomain(String webAddress, String email) {
		
		return webAddress.contains(email.split("@")[1]);
		
	}
	
	
	public static boolean checkIfEmail(String email) {
		
		String regex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2,})?$";
		Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE );
		return pattern.matcher(email).matches();
	}
	
	
	@Override
	public Result Validate(String email) {
		
		return new SuccessResult("Mail doğrulanmıştır.");
		
	}

}
