package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobSeekerCvEducationService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerCvEducationDao;
import kodlama.io.hrms.entities.concretes.JobSeekerCvEducation;

@Service
public class JobSeekerCvEducationManager implements JobSeekerCvEducationService{

	JobSeekerCvEducationDao jobSeekerCvEducationDao;
	
	@Autowired
	public JobSeekerCvEducationManager(JobSeekerCvEducationDao jobSeekerCvEducationDao) {
		super();
		this.jobSeekerCvEducationDao = jobSeekerCvEducationDao;
	}

	@Override
	public DataResult<List<JobSeekerCvEducation>> getAllByJobSeekerCV_Id(int jobSeekerId) {
		
		return new SuccessDataResult<List<JobSeekerCvEducation>>(this.jobSeekerCvEducationDao.findAllByJobSeekerCV_Id(jobSeekerId), "Data Listelendi");
	}

	@Override
	public DataResult<List<JobSeekerCvEducation>> getAllByJobSeekerCV_IdOrderByGraduationDate(int jobSeekerCVId) {
		
		return  new SuccessDataResult<List<JobSeekerCvEducation>>(this.jobSeekerCvEducationDao.findAllByJobSeekerCV_IdOrderByGraduationDate(jobSeekerCVId), "Data Listelendi");
	}

	@Override
	public DataResult<List<JobSeekerCvEducation>> getAllByJobSeekerCV_IdOrderByGraduationDateDesc(int jobSeekerCVId) {
		
		 return  new SuccessDataResult<List<JobSeekerCvEducation>>(this.jobSeekerCvEducationDao.findAllByJobSeekerCV_IdOrderByGraduationDateDesc(jobSeekerCVId), "Data Listelendi");
	}

	@Override
	public Result add(JobSeekerCvEducation jobSeekerCvEducation) {
		this.jobSeekerCvEducationDao.save(jobSeekerCvEducation);
		return new SuccessResult("Education saved");
	}

}
