package kodlama.io.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobSeekerCvService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeekerCV;

@RestController
@RequestMapping("/api/jobSeekerCV")
public class JobSeekerCvController {

	JobSeekerCvService jobSeekerCvService;

	@Autowired
	public JobSeekerCvController(JobSeekerCvService jobSeekerCvService) {
		super();
		this.jobSeekerCvService = jobSeekerCvService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobSeekerCV jobSeekerCV) {
		return ResponseEntity.ok( this.jobSeekerCvService.add(jobSeekerCV));
	}
	
	@GetMapping("/jobSeekerId")
	public ResponseEntity<DataResult<JobSeekerCV>> getByJobSeeker_Id(int jobSeekerId){
		return ResponseEntity.ok(this.jobSeekerCvService.getByJobSeeker_Id(jobSeekerId)); 
	}

	

}
