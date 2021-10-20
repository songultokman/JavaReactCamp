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
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode
@Table(name="job_seeker_cv_languages")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerCvLanguage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotBlank
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Size(max = 50)
	@Column(name="name")
	private String name;
	
	@NotNull
    @Range(min = 1, max = 6)
    @Column(name = "level")
    private short level;
	
	@ManyToOne()
	@JoinColumn(name="job_seeker_cv_id", referencedColumnName="id")
	private JobSeekerCV jobSeekerCV;
	
}
