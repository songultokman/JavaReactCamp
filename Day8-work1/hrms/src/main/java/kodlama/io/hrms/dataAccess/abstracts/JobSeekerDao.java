package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.hrms.entities.concretes.JobSeeker;

@Repository
public interface JobSeekerDao extends JpaRepository <JobSeeker,Integer> {

	
     JobSeeker findByEmail(String email);
	
	JobSeeker findByIdentityNumber(String identityNumber);


}
