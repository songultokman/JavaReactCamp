package kodlama.io.hrms.entities.concretes;


import java.time.LocalDate;

//import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name="job_seeker_cv_educations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobSeekerCvEducation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
    @Size(max = 100)
	@Column(name="school_name")
	private String schoolName;
	
	@NotBlank
    @Size(max = 100)
	@Column(name="department_name")
	private String departmentName;
	
    @NotNull
	@PastOrPresent
	@Column(name="start_date")
	private LocalDate startDate;
	
	@PastOrPresent//Şuanki tarihten ileri bir tarih girilemez
	@Column(name="graduation_date")
	private LocalDate graduationDate;
	
	@JsonIgnore
	@NotNull
	@ManyToOne()
	@JoinColumn(name="job_seeker_cv_id")
	private JobSeekerCV jobSeekerCV;
}
