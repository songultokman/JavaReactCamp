package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlama.io.hrms.business.abstracts.JobSeekerCvImageService;
import kodlama.io.hrms.business.abstracts.JobSeekerCvService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeekerCV;
import kodlama.io.hrms.entities.concretes.JobSeekerCvImage;

@RestController
@RequestMapping("api/images")
public class JobSeekerCvImageController {

	private JobSeekerCvImageService jobSeekerCvImageService;
	private JobSeekerCvService jobSeekerCvService;
	
    @Autowired
    public JobSeekerCvImageController(JobSeekerCvImageService jobSeekerCvImageService,
			JobSeekerCvService jobSeekerCvService) {
		super();
		this.jobSeekerCvImageService = jobSeekerCvImageService;
		this.jobSeekerCvService = jobSeekerCvService;
	}

	@GetMapping("/getById")
	public DataResult<JobSeekerCvImage> getById(@RequestParam("id") int id){
		return this.jobSeekerCvImageService.getById(id);
	}
   
	@PostMapping("/add")
	public  ResponseEntity<?> add(@RequestParam(value="job_seeker_cv_id") int id, @RequestParam(value="image") MultipartFile file){
		JobSeekerCV jobSeekerCV=this.jobSeekerCvService.getByJobSeeker_Id(id).getData();
		JobSeekerCvImage jobSeekerCvImage=new JobSeekerCvImage();
		jobSeekerCvImage.setJobSeekerCV(jobSeekerCV);
		return ResponseEntity.ok(this.jobSeekerCvImageService.add(jobSeekerCvImage, file));
	
	}
	
    @DeleteMapping("delete")
    public Result delete(@RequestParam("id") int id) {
        return this.jobSeekerCvImageService.delete(id);
    }

    @GetMapping("getall")
    public DataResult<List<JobSeekerCvImage>> getAll() {
        return this.jobSeekerCvImageService.getAll();
    }
}
