package kodlama.io.hrms.entities.concretes;

import java.time.LocalDateTime;

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

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seeker_cv_web_sites")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobSeekerCvWebSite {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private  LocalDateTime createdAt = LocalDateTime.now();
	
	@NotBlank
	@Column(name="name")
	private String name;
	
	@NotBlank
    @Length(max = 200)
    @Column(name = "address")
    private String address;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="job_seeker_cv_id")
	private JobSeekerCV jobSeekerCV;

	
	
}
