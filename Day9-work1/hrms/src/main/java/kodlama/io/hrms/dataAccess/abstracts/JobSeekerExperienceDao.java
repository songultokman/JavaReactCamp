package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobSeekerCvExperience;

public interface JobSeekerExperienceDao   extends JpaRepository<JobSeekerCvExperience, Integer>{

	List<JobSeekerCvExperience> findAllByJobSeekerCV_Id(int jobSeekerCVId);
	
	List<JobSeekerCvExperience> findAllJobSeekerCV_IdOrderByQuitDate(int jobSeekerCVId);
	
	List<JobSeekerCvExperience> findAllByJobSeekerCV_IdOrderByQuitDateDesc(int jobSeekerCVId);
}
