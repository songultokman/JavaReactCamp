package kodlama.io.hrms.business.concretes;


import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import kodlama.io.hrms.business.abstracts.JobSeekerCvImageService;
import kodlama.io.hrms.core.adapters.CloudinaryAdapterService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerCvImageDao;
import kodlama.io.hrms.entities.concretes.JobSeekerCvImage;

@Service
public class JobSeekerCvImageManager implements JobSeekerCvImageService {

	private JobSeekerCvImageDao jobSeekerCvImageDao;
	private CloudinaryAdapterService cloudinaryAdapterService;


	@Autowired
	public JobSeekerCvImageManager(JobSeekerCvImageDao jobSeekerCvImageDao,CloudinaryAdapterService cloudinaryAdapterService) {
		super();
		this.jobSeekerCvImageDao = jobSeekerCvImageDao;
		this.cloudinaryAdapterService = cloudinaryAdapterService;
	  }
	
	
	@SuppressWarnings({"unchecked"})
	@Override
	public Result add(JobSeekerCvImage jobSeekerCvImage , MultipartFile file) {
		
		Map<String,String> uploadImage = this.cloudinaryAdapterService.uploadImage(file).getData();
		jobSeekerCvImage.setUrl(uploadImage.get("url"));
		
		this.jobSeekerCvImageDao.save(jobSeekerCvImage);
		
		 return new SuccessResult("Image added");
	}

	@Override
	public Result delete(int imageId) {
		
		jobSeekerCvImageDao.deleteById(imageId);
		return new SuccessResult("Resim kaydı silindi");
	}

	
	/*@Override
	public DataResult<List<JobSeekerCvImage>> findAllByJobSeekerCV_Id(int jobSeekerCVId) {
		
		return new SuccessDataResult<List<JobSeekerCvImage>>(this.jobSeekerCvImageDao.findAllByJobSeekerCV_Id(jobSeekerCVId), "Data Listelendi");
	}*/


	@Override
	public DataResult<List<JobSeekerCvImage>> getAll() {
		
		return new SuccessDataResult<List<JobSeekerCvImage>>(this.jobSeekerCvImageDao.findAll(), "Data Listelendi");
	}


	@Override
	public DataResult<JobSeekerCvImage> getById(int id) {
		
		return new SuccessDataResult<JobSeekerCvImage>(this.jobSeekerCvImageDao.getById(id));
	}



}
