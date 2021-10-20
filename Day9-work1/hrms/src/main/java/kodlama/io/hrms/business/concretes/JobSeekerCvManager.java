package kodlama.io.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobSeekerCvService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerCvDao;
import kodlama.io.hrms.entities.concretes.JobSeekerCV;


@Service
public class JobSeekerCvManager implements JobSeekerCvService{

	JobSeekerCvDao jobSeekerCvDao;														
	
	@Autowired
	public JobSeekerCvManager(JobSeekerCvDao jobSeekerCvDao) {
		super();
		this.jobSeekerCvDao = jobSeekerCvDao;
	}

	@Override
	public DataResult<JobSeekerCV> getByJobSeeker_Id(int jobSeekerId) {
		
	   return new SuccessDataResult<JobSeekerCV>(this.jobSeekerCvDao.getById(jobSeekerId), "Data listelendi");
	}

	@Override
	public Result add(JobSeekerCV jobSeekerCV) {
		
		return new SuccessDataResult<JobSeekerCV>(this.jobSeekerCvDao.save(jobSeekerCV));
	}

}
