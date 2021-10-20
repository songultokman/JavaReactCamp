package kodlama.io.hrms.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobSeeker")
public class JobSeekerConrtoller {

		private JobSeekerService jobSeekerService;
		
		@Autowired
		public JobSeekerConrtoller(JobSeekerService jobSeekerService) {
			super();
			this.jobSeekerService = jobSeekerService;
		}
		
		@GetMapping("/getall")
		public ResponseEntity<DataResult<List<JobSeeker>>> getAll(){
			return  ResponseEntity.ok(this.jobSeekerService.getAll());
		}

		@PostMapping("/add")
		public ResponseEntity<?> add(@RequestBody JobSeeker jobSeeker) {
			return ResponseEntity.ok( this.jobSeekerService.add(jobSeeker));
		}

}
