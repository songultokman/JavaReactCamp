package kodlama.io.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;


@Service
public interface JobSeekerService {

		
		Result add(JobSeeker jobSeeker);
		
		DataResult<List<JobSeeker >> getAll();
		
		DataResult<JobSeeker> getByEmail(String email);
		
		DataResult<JobSeeker> getByIdentityNumber(String identityNumber);

		
	}


