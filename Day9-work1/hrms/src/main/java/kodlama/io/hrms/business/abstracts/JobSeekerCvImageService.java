package kodlama.io.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeekerCvImage;

public interface JobSeekerCvImageService {

	//DataResult<List<JobSeekerCvImage>> getAllByJobSeekerCVId(int jobSeekerCVId);
	
	Result add(JobSeekerCvImage jobSeekerCvImage , MultipartFile file);
	
	Result delete(int imageId);
	
	DataResult<List<JobSeekerCvImage>> getAll();
	
	DataResult<JobSeekerCvImage> getById(int id);
	
}


