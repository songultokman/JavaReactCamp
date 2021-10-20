package kodlama.io.hrms.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private  int id;

    @Column(name = "email")
    @Email()
    @NotBlank
    @NotNull
    private  String email;

    @Column(name = "password")
    @NotBlank
    @NotNull
    @Size(min = 8,max = 32)
    private  String password;

    @Column(name = "password_repeat")
    @NotBlank
    @NotNull
    @Size(min = 8,max = 32)
    private  String passwordRepeat;

    

}