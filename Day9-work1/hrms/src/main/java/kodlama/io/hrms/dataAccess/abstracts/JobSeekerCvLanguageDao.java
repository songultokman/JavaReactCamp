package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobSeekerCvLanguage;

public interface JobSeekerCvLanguageDao  extends JpaRepository<JobSeekerCvLanguage, Integer>{

    List<JobSeekerCvLanguage> findAllByJobSeekerCV_Id(int jobSeekerCVId);
	 
}
