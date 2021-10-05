package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	 Result add (JobAdvertisement jobAdvertisement);
		
	 Result update(JobAdvertisement jobAdvertisement);

	Result delete(int advertisementId);
	
	Result changeToActive(int id);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByAplicationDeadlineDesc();
	
	DataResult<List<JobAdvertisement>> getByIsActive();
	
	DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployerId(int id);
	
	DataResult<JobAdvertisement>getById(int id);
  
}
