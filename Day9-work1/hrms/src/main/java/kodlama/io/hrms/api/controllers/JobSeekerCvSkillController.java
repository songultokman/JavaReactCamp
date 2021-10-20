package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobSeekerCvSkillService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeekerCvSkill;

@RestController
@RequestMapping("/api/jobSeekerSkillController")
public class JobSeekerCvSkillController {

	JobSeekerCvSkillService jobSeekerCvSkillService;

	@Autowired
	public JobSeekerCvSkillController(JobSeekerCvSkillService jobSeekerCvSkillService) {
		super();
		this.jobSeekerCvSkillService = jobSeekerCvSkillService;
	}
	
	@GetMapping("jobseekercvskill")
	public ResponseEntity<DataResult<List<JobSeekerCvSkill>>> getAllByJobSeekerCV_Id(int jobSeekerCVId){
		return ResponseEntity.ok(this.jobSeekerCvSkillService.getAllByJobSeekerCV_Id(jobSeekerCVId));
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobSeekerCvSkill JobSeekerCvSkill) {
		
		return ResponseEntity.ok(this.jobSeekerCvSkillService.add(JobSeekerCvSkill));
	}
}
