package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeekerCvEducation;

public interface JobSeekerCvEducationService {

	Result add (JobSeekerCvEducation jobSeekerCvEducation);
	
	DataResult<List<JobSeekerCvEducation>> getAllByJobSeekerCV_Id(int jobSeekerId);

	DataResult<List<JobSeekerCvEducation>> getAllByJobSeekerCV_IdOrderByGraduationDate(int jobSeekerCVId);
	
	DataResult<List<JobSeekerCvEducation>> getAllByJobSeekerCV_IdOrderByGraduationDateDesc(int jobSeekerCVId);
}
