package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> { //JpaRepository bizim için cloud bir veri tabanı işlemcisi oluşturur. 
	                                                                             //yani silme güncelleme ekleme gibi işlemleri yapmamızı sağlar. 

}
