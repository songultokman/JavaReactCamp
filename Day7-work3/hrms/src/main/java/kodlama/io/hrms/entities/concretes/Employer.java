package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
public class Employer extends User{

	@NotBlank()
	@Column(name="company_name")
	@NotEmpty(message = "Şirket ismini girin Lütfen")
	private String companyName;
	
	@NotBlank()
	@Column(name="web_adress")
	@NotEmpty(message = "Web adresini girin Lütfen")
	private String webAddress;
	
	@NotBlank()
	@Column(name="phone")
	@NotEmpty(message = "Telefon numarasını girin Lütfen")
	private String phone;
	
	
	
	
}
