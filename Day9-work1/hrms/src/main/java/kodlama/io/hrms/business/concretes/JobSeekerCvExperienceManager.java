package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobSeekerCvExperienceService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerExperienceDao;
import kodlama.io.hrms.entities.concretes.JobSeekerCvExperience;

@Service
public class JobSeekerCvExperienceManager implements JobSeekerCvExperienceService {

	JobSeekerExperienceDao jobSeekerExperienceDao;
	
	@Autowired
	public JobSeekerCvExperienceManager(JobSeekerExperienceDao jobSeekerExperienceDao) {
		super();
		this.jobSeekerExperienceDao = jobSeekerExperienceDao;
	}

	@Override
	public DataResult<List<JobSeekerCvExperience>> getAllByJobSeekerCV_Id(int jobSeekerCVId) {
		
		return new SuccessDataResult<List<JobSeekerCvExperience>> (this.jobSeekerExperienceDao.findAllByJobSeekerCV_Id(jobSeekerCVId));
	}

	
	@Override
	public DataResult<List<JobSeekerCvExperience>> getAllJobSeekerCV_IdOrderByQuitDate(int jobSeekerCVId) {
		
		return new SuccessDataResult<List<JobSeekerCvExperience>>(this.jobSeekerExperienceDao.findAllJobSeekerCV_IdOrderByQuitDate(jobSeekerCVId), "Data Listelendi");
	}

	@Override
	public DataResult<List<JobSeekerCvExperience>> getAllByJobSeekerCV_IdOrderByQuitDateDesc(int jobSeekerCVId) {
		
		return new SuccessDataResult<List<JobSeekerCvExperience>>(this.jobSeekerExperienceDao.findAllByJobSeekerCV_IdOrderByQuitDateDesc(jobSeekerCVId), "Data Listelendi");
	}
	
	

}
