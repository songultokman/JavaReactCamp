package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeekerCvExperience;

public interface JobSeekerCvExperienceService {

	DataResult<List<JobSeekerCvExperience>> getAllByJobSeekerCV_Id(int jobSeekerCVId);
	
	DataResult<List<JobSeekerCvExperience>> getAllJobSeekerCV_IdOrderByQuitDate(int jobSeekerCVId);
	
	DataResult<List<JobSeekerCvExperience>> getAllByJobSeekerCV_IdOrderByQuitDateDesc(int jobSeekerCVId);
}
