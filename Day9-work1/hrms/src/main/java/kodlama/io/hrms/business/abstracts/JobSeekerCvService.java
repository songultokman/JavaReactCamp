package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeekerCV;

public interface JobSeekerCvService {

	DataResult<JobSeekerCV> getByJobSeeker_Id(int jobSeekerId);
 
	Result add(JobSeekerCV jobSeekerCV);
}
