package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeekerCvSkill;

public interface JobSeekerCvSkillService {

	DataResult<List<JobSeekerCvSkill>>  getAllByJobSeekerCV_Id(int jobSeekerCVId);
	
	Result add(JobSeekerCvSkill JobSeekerCvSkill);
}
