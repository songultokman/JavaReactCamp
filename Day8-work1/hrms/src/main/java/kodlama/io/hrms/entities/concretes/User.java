package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
@Table(name = "users")
@MappedSuperclass
//@Inheritance(strategy=InheritanceType.JOINED)
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeekers"})
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private  int id;

    @Column(name = "email")
    @Email(message="Lütfen email formatında girin")
    @NotBlank
    private  String email;

    @Column(name = "password")
    @NotBlank
    @Size(min = 8,max = 32)
    private  String password;

    @Column(name = "password_repeat")
    @NotBlank
    @Size(min = 8,max = 32)
    private  String passwordRepeat;

    

}