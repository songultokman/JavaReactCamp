package kodlama.io.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobSeekerCV;

public interface JobSeekerCvDao extends JpaRepository<JobSeekerCV,Integer>{

	Optional<JobSeekerCV> findByJobSeeker_Id(int jobSeekerId);
}
