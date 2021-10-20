package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobSeekerCvWebSiteService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.core.utilies.results.SuccessDataResult;
import kodlama.io.hrms.core.utilies.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerCvWebSiteDao;
import kodlama.io.hrms.entities.concretes.JobSeekerCvWebSite;

@Service
public class JobSeekerCvWebSiteManager implements JobSeekerCvWebSiteService{

	private JobSeekerCvWebSiteDao jobSeekerCvWebSiteDao;
	
	@Autowired
	public JobSeekerCvWebSiteManager(JobSeekerCvWebSiteDao jobSeekerCvWebSiteDao) {
		super();
		this.jobSeekerCvWebSiteDao = jobSeekerCvWebSiteDao;
	}

	@Override
	public DataResult<List<JobSeekerCvWebSite>> getAllByJobSeekerCV_Id(int jobSeekerCVId) {
		
		return new SuccessDataResult<List<JobSeekerCvWebSite>>(this.jobSeekerCvWebSiteDao.findAllByJobSeekerCV_Id(jobSeekerCVId), "Data Listelendi");
	}

	@Override
	public Result add(JobSeekerCvWebSite jobSeekerCvWebSite) {
		this.jobSeekerCvWebSiteDao.save(jobSeekerCvWebSite);
		return new SuccessResult("Web site eklendi");
	}


}
