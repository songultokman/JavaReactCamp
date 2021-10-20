package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	DataResult<List<JobPosition>> getAll();
	
	Result add(JobPosition jobPosition);
}
