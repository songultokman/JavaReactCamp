package kodlama.io.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_seekers")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName ="id")

public class JobSeeker extends User {
	
	
	
	@Column(name="first_name", nullable = false)
	@NotBlank()
    @NotEmpty(message = "Adı Giriniz Lütfen")
	private String firstName;
	
	@Column(name="last_name" , nullable = false)
	@NotBlank()
    @NotEmpty(message = "Soyadı Giriniz Lütfen")
	private String lastName;
	
	@Column(name="identity_number")
	 @NotEmpty(message = "TC kimlik Numarası Giriniz Lütfen")
    @NotBlank()
	private String identityNumber;
	
	@Column(name="birth_year")
	@NotBlank()
    @NotEmpty(message = "Doğum yılınızı Giriniz Lütfen")
	private Integer birthYear;
	
	
   	

	
}
