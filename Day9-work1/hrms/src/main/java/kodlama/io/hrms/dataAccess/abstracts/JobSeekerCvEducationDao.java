package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.hrms.entities.concretes.JobSeekerCvEducation;

public interface JobSeekerCvEducationDao extends JpaRepository<JobSeekerCvEducation, Integer>{

	List<JobSeekerCvEducation> findAllByJobSeekerCV_Id(int jobSeekerId);
	
	List<JobSeekerCvEducation> findAllByJobSeekerCV_IdOrderByGraduationDate(int jobSeekerCVId);
	
	List<JobSeekerCvEducation> findAllByJobSeekerCV_IdOrderByGraduationDateDesc(int jobSeekerCVId);
}
