package kodlama.io.hrms.entities.concretes;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seeker_cv_skills")
public class JobSeekerCvSkill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
    @Length(max = 100)
    @Column(name = "name")
    private String name;
	
	@JsonIgnore
	@NotNull
	@ManyToOne()
	@JoinColumn(name="job_seeker_cv_id")
	private JobSeekerCV jobSeekerCV;
	
}
