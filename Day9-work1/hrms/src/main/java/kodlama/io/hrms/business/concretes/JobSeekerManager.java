package kodlama.io.hrms.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.ErrorResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.core.utilies.validations.concretes.MailValidation;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.hrms.entities.concretes.JobSeeker;


@Service
public class JobSeekerManager implements JobSeekerService {

	    
		private JobSeekerDao jobSeekerDao;
		public JobSeekerManager() {}
		
		@Autowired
		public JobSeekerManager(JobSeekerDao jobSeekerDao) {
			super();
			this.jobSeekerDao = jobSeekerDao;
		}
		
		
		
		@Override
		public Result add(JobSeeker jobSeeker) {
		
			if(!dataControl(jobSeeker)) {
				return new ErrorResult("Kayıt için lütfen tüm alanları doldurun");
			}
			else if(!jobSeeker.getPassword().equals(jobSeeker.getPasswordRepeat())) {
				return new ErrorResult("Şifreler eşleşmiyor");
			}
			
			
		   /*else if(!identityValidation.(jobSeeker.getIdentityNumber()))
			{
					return new ErrorResult("Girilen kimlik numarası geçersizdir.");
				}*/
		
			else if(!MailValidation.checkIfEmail(jobSeeker.getEmail())) {
				return new ErrorResult("Eposta adresiniz geçerli değil  "+ jobSeeker.getEmail());
				}
			
			else if(this.jobSeekerDao.findByEmail(jobSeeker.getEmail())!=null){    
				return new ErrorResult("E posta adresiniz sistemde kayıtlıdır");
			}
			else if(this.jobSeekerDao.findByIdentityNumber(jobSeeker.getIdentityNumber())!=null) { 
				return new ErrorResult("Tc kimlik numaranız sistemde kayıtlıdır.");
			}
	
			 else {
			this.jobSeekerDao.save(jobSeeker);	
           return new SuccessResult("Aday Eklendi"); }	
			
			
		}
		
		@Override
		public DataResult<List<JobSeeker>> getAll() {
			
			return new SuccessDataResult<List<JobSeeker>> (this.jobSeekerDao.findAll(),"Data Listelendi");
		}

		@Override
		public DataResult<JobSeeker> getByEmail(String email) {
			
			return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByEmail(email));
		}

		@Override
		public DataResult<JobSeeker> getByIdentityNumber(String identityNumber) {
			
			return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByIdentityNumber(identityNumber));
		
		}

	
		private boolean dataControl(JobSeeker jobSeeker)
		{
			if (jobSeeker.getEmail() == null || jobSeeker.getEmail().isBlank() ||
				jobSeeker.getFirstName()== null || jobSeeker.getFirstName().isBlank() ||
				jobSeeker.getLastName() == null || jobSeeker.getLastName().isBlank() || 
				jobSeeker.getIdentityNumber() == null || jobSeeker.getIdentityNumber().isBlank() ||
				jobSeeker.getPassword() == null || jobSeeker.getPassword().isBlank() ||
				jobSeeker.getBirthDate()==null)
				 {
				return false;
			}
			else {
				return true;
			}
		}

		
	

}
