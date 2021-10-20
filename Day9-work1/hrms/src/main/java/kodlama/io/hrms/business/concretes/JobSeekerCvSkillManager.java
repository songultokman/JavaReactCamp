package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobSeekerCvSkillService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerCvSkillDao;
import kodlama.io.hrms.entities.concretes.JobSeekerCvSkill;

@Service
public class JobSeekerCvSkillManager implements JobSeekerCvSkillService{

	JobSeekerCvSkillDao jobSeekerCvSkillDao;
	
	public JobSeekerCvSkillManager(JobSeekerCvSkillDao jobSeekerCvSkillDao) {
		super();
		this.jobSeekerCvSkillDao = jobSeekerCvSkillDao;
	}

	@Override
	public DataResult<List<JobSeekerCvSkill>> getAllByJobSeekerCV_Id(int jobSeekerCVId) {
	
		return new SuccessDataResult<List<JobSeekerCvSkill>>(this.jobSeekerCvSkillDao.findAllByJobSeekerCV_Id(jobSeekerCVId), "Data Listelendi");
	}

	@Override
	public Result add(JobSeekerCvSkill jobSeekerCvSkill) {
	
		return new SuccessDataResult<JobSeekerCvSkill>(this.jobSeekerCvSkillDao.save(jobSeekerCvSkill));
	}

}
