
package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
@Table(name="job_seeker_cvs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobSeekerCV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Length(max = 300)
	@Column(name="cover_letter")
	private String coverLetter;
	
	@JsonIgnore
	@OneToOne
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "id")
	private JobSeeker jobSeeker; 
	
	@JsonIgnore
	@OneToMany(mappedBy="jobSeekerCV")
	private List<JobSeekerCvLanguage> languages ;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobSeekerCV")
	private List<JobSeekerCvEducation> jobSeekerCvEducations;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobSeekerCV")
	private List<JobSeekerCvExperience> jobSeekerCvExperience;
	
    @JsonIgnore
	@OneToMany(mappedBy="jobSeekerCV")
	private List<JobSeekerCvWebSite> webSites;
    
    @JsonIgnore
	@OneToMany(mappedBy = "jobSeekerCV")
	private List<JobSeekerCvImage> images;

    @JsonIgnore
	@OneToMany(mappedBy = "jobSeekerCV")
	private List<JobSeekerCvSkill> skills;

    
}
