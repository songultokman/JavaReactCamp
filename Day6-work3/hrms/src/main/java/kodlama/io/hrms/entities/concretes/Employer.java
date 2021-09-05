package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import kodlama.io.hrms.entities.abstracts.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data

@Entity

@Table(name="employers")
public class Employer extends User {
     
	
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String CompanyName;
	
	@Column(name="web_adress")
	private String webAdress;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
}
