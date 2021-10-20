package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.hrms.business.abstracts.JobSeekerCvLanguageService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeekerCvLanguage;

@RestController
@RequestMapping("/api/Language")
public class JobSeekerCvLanguageController {

	JobSeekerCvLanguageService jobSeekerCvLanguageService;

	@Autowired
	public JobSeekerCvLanguageController(JobSeekerCvLanguageService jobSeekerCvLanguageService) {
		super();
		this.jobSeekerCvLanguageService = jobSeekerCvLanguageService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobSeekerCvLanguage jobSeekerCvLanguage) {
		
		return ResponseEntity.ok(this.jobSeekerCvLanguageService.add(jobSeekerCvLanguage));
	}
	
	@GetMapping("/getAllByJobSeekerCV_Id")
	public ResponseEntity<DataResult<List<JobSeekerCvLanguage>>> getAllByJobSeekerCV_Id(int jobSeekerCV){
		return ResponseEntity.ok(this.jobSeekerCvLanguageService.getAllByJobSeekerCV_Id(jobSeekerCV));
	}
}
