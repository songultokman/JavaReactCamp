package kodlama.io.hrms.business.concretes;

//import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.ErrorResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;
@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
	    
		//jobAdvertisement.setPostDate(new Date());
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı kaydedildi");
	}

	
	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı güncellendi");
	}

	
	@Override
	public Result delete(int advertisementId) {
		this.jobAdvertisementDao.deleteById(advertisementId);
		return new SuccessResult("İş ilanı silindi");
	}

	
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll(), "Data listelendi");
	}

	
	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByAplicationDeadlineDesc() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "applicationDeadline");
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveTrueOrderByAplicationDeadlineDesc(sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActive() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployerId(int id) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrueAndEmployerId(id));
	}

	
	public DataResult<JobAdvertisement> getById(int id) {
		
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.getById(id));
	}


	@Override
	public Result changeToActive(int id) {
		if(getById(id)==null) {
			return new ErrorResult("Böyle bir iş ilanı bulunmamaktadır");
		}
		if(getById(id).getData().isActive()==false) {
			return new SuccessResult("İş ilanı zaten kapalı");
		}
		
		JobAdvertisement jobAdvertisement=getById(id).getData();
		jobAdvertisement.setActive(false);
		update(jobAdvertisement);
		return new SuccessResult("İş ilanı başarılı bir şekilde kapatıldı");
	}
 
}
