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

import kodlama.io.hrms.business.abstracts.JobSeekerCvEducationService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeekerCvEducation;

@RestController
@RequestMapping("/api/JobSeekerCvEducation")
public class JobSeekerCvEducationController {

	private JobSeekerCvEducationService jobSeekerCvEducationService;

	@Autowired
	public JobSeekerCvEducationController(JobSeekerCvEducationService jobSeekerCvEducationService) {
		super();
		this.jobSeekerCvEducationService = jobSeekerCvEducationService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody JobSeekerCvEducation jobSeekerCvEducation){
		return ResponseEntity.ok(jobSeekerCvEducation);
	}
	
	@GetMapping("/getJobSeekerCvId")
	public ResponseEntity<DataResult<List<JobSeekerCvEducation>>> getAllByJobSeekerCV_Id(int jobSeekerId){
		return ResponseEntity.ok(this.jobSeekerCvEducationService.getAllByJobSeekerCV_Id(jobSeekerId));
	}
	
	@GetMapping("/byjobseekercvidorderbygraduationdate")
	public ResponseEntity<DataResult<List<JobSeekerCvEducation>>> getAllByJobSeekerCV_IdOrderByGraduationDate(int jobSeekerCVId){
		return ResponseEntity.ok(this.jobSeekerCvEducationService.getAllByJobSeekerCV_IdOrderByGraduationDate(jobSeekerCVId));
	}
	
	@GetMapping("/byjobseekercvidorderbygraduationdatedesc")
	public ResponseEntity<DataResult<List<JobSeekerCvEducation>>> getAllByJobSeekerCVIdOrderByGraduationDateDesc(int jobSeekerCVId){
		return ResponseEntity.ok(this.jobSeekerCvEducationService.getAllByJobSeekerCV_IdOrderByGraduationDateDesc(jobSeekerCVId));
	}
}
