package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobSeekerCvWebSite;

public interface JobSeekerCvWebSiteDao extends JpaRepository<JobSeekerCvWebSite,Integer>{

	List<JobSeekerCvWebSite> findAllByJobSeekerCV_Id(int jobSeekerCVId);
	 
	
}
