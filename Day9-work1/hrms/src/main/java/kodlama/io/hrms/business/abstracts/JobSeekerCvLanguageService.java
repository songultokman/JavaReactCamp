package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeekerCvLanguage;

public interface JobSeekerCvLanguageService {

	Result add(JobSeekerCvLanguage language);
	
	DataResult<List<JobSeekerCvLanguage>> getAllByJobSeekerCV_Id(int jobSeekerCVId);
	
}
