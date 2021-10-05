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


import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
@Entity
@Table(name="job_advertisement")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobAdvertisement {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="post_id")
	private int id;
	
	@Column(name="description")
	private String description ;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd")
	@Column(name="post_date",nullable = false)
	private LocalDateTime postDate ;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd")
	@Column(name="last_day",nullable = false)
	private LocalDateTime applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive ;
	
	@Column(name="free_positions")
	private Integer freePositions ;
	
	@ManyToOne()
	@JoinColumn(name="job_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name="company_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	
	
}
