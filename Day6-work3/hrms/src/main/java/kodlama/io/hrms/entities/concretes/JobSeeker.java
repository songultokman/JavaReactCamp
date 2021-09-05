package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import kodlama.io.hrms.entities.abstracts.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data

@Entity

@Table(name="job_seekers")

public class JobSeeker extends User{

	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="idntity_number")
	private String identityNumber;
	
	@Column(name="birth_year")
	private LocalDate birthYear;
}
