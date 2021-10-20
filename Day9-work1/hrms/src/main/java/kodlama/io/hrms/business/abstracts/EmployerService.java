package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll(); 
	
	Result add(Employer employer);
	
	DataResult<Employer> getByEmail(String email);
}
