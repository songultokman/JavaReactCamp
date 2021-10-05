package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobAdvertisements"})
public class Employer extends User{

	@NotBlank()
	@Column(name="company_name")
	@NotEmpty(message = "Şirket ismini girin Lütfen")
	private String companyName;
	
	@NotBlank()
	@Column(name="web_address")
	@NotEmpty(message = "Web adresini girin Lütfen")
	private String webAddress;
	
	@NotBlank()
	@Column(name="phone")
	@NotEmpty(message = "Telefon numarasını girin Lütfen")
	private String phone;
	
	@OneToMany(mappedBy="employer")
	//@JsonBackReference
	private List<JobAdvertisement> jobAdvertisements;

	
}
