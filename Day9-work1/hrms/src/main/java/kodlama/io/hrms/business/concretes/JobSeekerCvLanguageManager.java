package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.hrms.business.abstracts.JobSeekerCvLanguageService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerCvLanguageDao;
import kodlama.io.hrms.entities.concretes.JobSeekerCvLanguage;

@Service
public class JobSeekerCvLanguageManager implements JobSeekerCvLanguageService{

	JobSeekerCvLanguageDao jobSeekerCvLanguageDao;
	
    @Autowired
	public JobSeekerCvLanguageManager(JobSeekerCvLanguageDao jobSeekerCvLanguageDao) {
		super();
		this.jobSeekerCvLanguageDao = jobSeekerCvLanguageDao;
	}

	@Override
	public Result add(JobSeekerCvLanguage jobSeekerCvLanguage) {
		this.jobSeekerCvLanguageDao.save(jobSeekerCvLanguage);
		return new SuccessResult("yabancı dil bilgisi kaydedildi");
		
	}
	@Override
	public DataResult<List<JobSeekerCvLanguage>> getAllByJobSeekerCV_Id(int jobSeekerCVId) {
		
		return new SuccessDataResult<List<JobSeekerCvLanguage>>(this.jobSeekerCvLanguageDao.findAll(), "Data Listelendi");
	}

}
