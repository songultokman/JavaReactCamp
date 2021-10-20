package kodlama.io.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobSeekerCvExperienceService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeekerCvExperience;


@RestController
@RequestMapping("/getJobSeekerController")
public class JobSeekerCvExperienceController {

	
	JobSeekerCvExperienceService jobSeekerCvExperienceService;

	@Autowired
	public JobSeekerCvExperienceController(JobSeekerCvExperienceService jobSeekerCvExperienceService) {
		super();
		this.jobSeekerCvExperienceService = jobSeekerCvExperienceService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerCvExperience jobSeekerCvExperince){
		return ResponseEntity.ok(jobSeekerCvExperince);
	}
	
	@GetMapping("/getJobSeekerCvId")
	public ResponseEntity<DataResult<List<JobSeekerCvExperience>>> getAllByJobSeekerCV_Id(int jobSeekerId){
		return ResponseEntity.ok(this.jobSeekerCvExperienceService.getAllByJobSeekerCV_Id(jobSeekerId));
	}
	
	@GetMapping("/byjobseekercvidorderbyquitdate")
	public ResponseEntity<DataResult<List<JobSeekerCvExperience>>> getAllByJobSeekerCV_IdOrderByQuitDate(int jobSeekerCVId){
		return ResponseEntity.ok(this.jobSeekerCvExperienceService.getAllJobSeekerCV_IdOrderByQuitDate(jobSeekerCVId));
	}
	
	@GetMapping("/byjobseekercvidorderbyquitdatedesc")
	public ResponseEntity<DataResult<List<JobSeekerCvExperience>>> getAllByJobSeekerCVIdOrderByQuitDateDesc(int jobSeekerCVId){
		return ResponseEntity.ok(this.jobSeekerCvExperienceService.getAllByJobSeekerCV_IdOrderByQuitDateDesc(jobSeekerCVId));
	}
	
}
