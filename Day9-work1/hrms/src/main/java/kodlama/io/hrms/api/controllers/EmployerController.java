package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilies.results.DataResult;
import kodlama.io.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/Employer")
public class EmployerController {

	private EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity< DataResult<List<Employer>>> getAll(){
		return ResponseEntity.ok(this.employerService.getAll());
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Employer employer) {
		return ResponseEntity.ok(this.employerService.add(employer));
		
	}
	
	
	
	
	
	
	
	
 }
