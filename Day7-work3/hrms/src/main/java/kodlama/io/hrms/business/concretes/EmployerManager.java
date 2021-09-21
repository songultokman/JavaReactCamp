package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.ErrorResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.core.utilies.validations.concretes.MailValidation;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if(!dataControl(employer)) {
			return new ErrorResult("Lütfen tüm alanları doldurun!");
			
		}
		else if(!MailValidation.checkIfEmail(employer.getEmail())) {
			return new ErrorResult("Eposta adresiniz geçerli değil  "+ employer.getEmail());
		}
		
		else if(!employer.getPassword().equals(employer.getPasswordRepeat())) {
			return new ErrorResult("Şifreler eşleşmiyor");
		}
		
		else if(this.employerDao.findByEmail(employer.getEmail())!=null) {
			return new ErrorResult("E posta adresiniz sistemde kayıtlıdır");
		}
		else if(!MailValidation.checkEmailDomain(employer.getWebAddress(),employer.getEmail())) {
			return new ErrorResult("Web adres ile email uyuşmuyor.");
		}
			
			
			
		else if(!MailValidation.checkIfEmail(employer.getEmail())) {
			   return new ErrorResult("Mail doğrulanmamıştır.");
		}
		
		else {
			this.employerDao.save(employer);
			return new SuccessResult("İş veren kaydedildi.");
		}
	}
	
	
	
	
	private boolean dataControl(Employer employer)
	{
		if (employer.getEmail() == null || employer.getEmail().isBlank() ||
			employer.getCompanyName()== null || employer.getCompanyName().isBlank() ||
			employer.getPhone() == null || employer.getPhone().isBlank() || 
			employer.getPassword() == null || employer.getPassword().isBlank() ||
			employer.getPassword() == null || employer.getPassword().isBlank() ||
			employer.getWebAddress()==null ||  employer.getWebAddress().isBlank() )
			 {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public DataResult<Employer> getByEmail(String email) {
		
		return new SuccessDataResult<Employer>(this.employerDao.findByEmail(email));
	}

}
