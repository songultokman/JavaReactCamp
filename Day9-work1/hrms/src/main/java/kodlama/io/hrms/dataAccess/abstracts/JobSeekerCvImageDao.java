package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.hrms.entities.concretes.JobSeekerCvImage;

public interface JobSeekerCvImageDao extends JpaRepository<JobSeekerCvImage, Integer>{

	List<JobSeekerCvImage> findAllByJobSeekerCV_Id(int JobSeekerCVId);
}
