package kodlama.io.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import kodlama.io.hrms.core.entities.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="system_personel")
@EqualsAndHashCode(callSuper=false)
public class SystemPersonnel extends User {

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;	

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-mm-dd")
	@Column(name="start_date")
    private Date startDate;
	
	
}
