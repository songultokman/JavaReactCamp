package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobSeekerCvSkill;

public interface JobSeekerCvSkillDao extends JpaRepository<JobSeekerCvSkill, Integer> {
 
	List<JobSeekerCvSkill> findAllByJobSeekerCV_Id(int jobSeekerCVId);
}
