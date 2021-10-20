package kodlama.io.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Table(name="job_seeker_cv_images")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobSeekerCvImage {

	 @NotNull
	 @Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	 private LocalDateTime createdAt = LocalDateTime.now();

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
	@Column(name="url")
	private String url;
	
	@NotNull
	@OneToOne
	@JoinColumn(name="job_seeker_cv_id")
	private JobSeekerCV jobSeekerCV;
}
