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

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {//Aslında productManagerın getAll fonksyonu çaışır.
		super();
		this.jobPositionService = jobPositionService;
	}

	 @PostMapping("/add")
	 public  ResponseEntity<?>  add(@Valid @RequestBody JobPosition jobPosition)
	 {
			return ResponseEntity.ok(this.jobPositionService.add(jobPosition));
	 }
	
	@GetMapping("/getall")
    public ResponseEntity<DataResult<List<JobPosition>>> getAll()
    {
    	return ResponseEntity.ok(this.jobPositionService.getAll());
    }
	
   
}
