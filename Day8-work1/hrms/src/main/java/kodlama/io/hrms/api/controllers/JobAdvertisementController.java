package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobAdvertisementService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.core.utilies.results.Result;
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
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
		
	}
	@PostMapping("/changeToActive")
	public Result changeToActive(int id) {
		return this.jobAdvertisementService.changeToActive(id);
	}
	
	@GetMapping("/getByOrderByAplicationDeadlineDesc")
	public DataResult<List<JobAdvertisement>>  getOrderByApplicationDeadline(){
		return this.jobAdvertisementService.getByIsActiveTrueOrderByAplicationDeadlineDesc();
	}
	
	
	@GetMapping("/getActiveEmployer")
	public DataResult<List<JobAdvertisement>> getActiveEmployer(int id){
		return this.jobAdvertisementService.getByIsActiveTrueAndEmployerId(id);
	}
	
	
	
	
}
