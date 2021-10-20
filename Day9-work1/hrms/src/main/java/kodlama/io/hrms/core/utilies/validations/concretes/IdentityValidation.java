package kodlama.io.hrms.core.utilies.validations.concretes;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.utilies.validations.abstracts.IdentityValidationService;
//import kodlama.io.hrms.entities.concretes.JobSeeker;
@Service
public class IdentityValidation implements  IdentityValidationService{

	//@Override
	//public boolean isIdentityTrue(JobSeeker jobSeeker) {
		/*KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getIdentityNumber()), 
					jobSeeker.getFirstName().toUpperCase(new Locale("tr")), 
					jobSeeker.getLastName().toUpperCase(new Locale("tr")),
					jobSeeker.getBirthYear()
					);
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return result;*/
		
	//}

	@Override
	public boolean validationIdentity(String identityNumber) {
		
		return true;
	}

	}
