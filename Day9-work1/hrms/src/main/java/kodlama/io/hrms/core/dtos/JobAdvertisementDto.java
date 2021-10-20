package kodlama.io.hrms.core.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

	private int id;
	private String description ;
	private Date postDate ;
	private Date applicationDeadline;
	private String freePositions ;
	private boolean isActive ;
	private String jobName;
	private String cityName;
	private String companyName;
	
	
}
