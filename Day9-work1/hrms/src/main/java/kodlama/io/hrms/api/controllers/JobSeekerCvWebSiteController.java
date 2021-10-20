package kodlama.io.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobSeekerCvWebSiteService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeekerCvWebSite;

@RestController
@RequestMapping("/api/jobseekercvwebsite")
public class JobSeekerCvWebSiteController {

	private JobSeekerCvWebSiteService jobSeekerCvWebSiteService;

	@Autowired
	public JobSeekerCvWebSiteController(JobSeekerCvWebSiteService jobSeekerCvWebSiteService) {
		super();
		this.jobSeekerCvWebSiteService = jobSeekerCvWebSiteService;
	}
	
	@GetMapping("/jobseekercvwebsite")
	public ResponseEntity<DataResult<List<JobSeekerCvWebSite>>> findAllByJobSeekerCV_Id(int jobSeekerCVId) {
		return ResponseEntity.ok(this.jobSeekerCvWebSiteService.getAllByJobSeekerCV_Id(jobSeekerCVId));
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerCvWebSite jobSeekerCvWebSite){
		return this.jobSeekerCvWebSiteService.add(jobSeekerCvWebSite);
	}
	
	
	
}
