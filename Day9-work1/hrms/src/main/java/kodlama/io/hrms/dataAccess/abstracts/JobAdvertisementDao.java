package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import kodlama.io.hrms.core.dtos.JobAdvertisementDto;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	@Query("From JobAdvertisement where isActive=true")   //Tüm aktif iş ilanları gösterilir.
	List<JobAdvertisement> getByIsActiveTrue();  //getBy tanımlaması yaparken JobAdvertisement clasında "active" nasıl tanımlamışsak öyle yazmalıyız
	
	
	@Query("From JobAdvertisement where isActive=true and company_id= :id ")	/// Buradaki sorguları veritabanından değil de jobAdvertisement classını veritabanı olarak kullanır.
	List<JobAdvertisement> getByIsActiveTrueAndEmployerId(int id);
	//Firmaya ait iş ilanları listelenir.
	
	
	
	@Query("From JobAdvertisement where isActive=true Order By applicationDeadline Desc") // Aktif iş ilanları tarihe göre listelenir.
	List<JobAdvertisement> getByIsActiveTrueOrderByAplicationDeadlineDesc(Sort sort);
	
	/*@Query("Select new kodlama.io.hrms.core.dtos.JobAdvertisementDto( c.companyName, c.cityName)"
			+ " From JobPosition j Inner Join j.Jobadvertisements job ")
	List<JobAdvertisementDto> getByEmployerwithJob();*/
}
