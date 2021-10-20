package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/JobAdvertisement")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity< DataResult<List<JobAdvertisement>>> getAll(){
		return ResponseEntity.ok(this.jobAdvertisementService.getAll());
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobAdvertisement jobAdvertisement) {
		return ResponseEntity.ok(this.jobAdvertisementService.add(jobAdvertisement));
		
	}
	@PostMapping("/changeToActive")
	public ResponseEntity<?> changeToActive(int id) {
		return  ResponseEntity.ok(this.jobAdvertisementService.changeToActive(id));
	}
	
	@GetMapping("/getByOrderByAplicationDeadlineDesc")
	public ResponseEntity<DataResult<List<JobAdvertisement>>>  getOrderByApplicationDeadline(){
		return ResponseEntity.ok(this.jobAdvertisementService.getByIsActiveTrueOrderByAplicationDeadlineDesc());
	}
	
	
	@GetMapping("/getActiveEmployer")
	public ResponseEntity< DataResult<List<JobAdvertisement>>> getActiveEmployer(int id){
		return ResponseEntity.ok(this.jobAdvertisementService.getByIsActiveTrueAndEmployerId(id));
	}
	
	
	
	
}
