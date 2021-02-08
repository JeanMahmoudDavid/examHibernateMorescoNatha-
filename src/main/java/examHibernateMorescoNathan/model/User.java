package examHibernateMorescoNathan.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @Basic(optional = false)
    @NotNull(message = "Veuillez saisir un Pseudo")
    @NotBlank(message = "Veuillez saisir un Pseudo")
    private String username;

    @Basic(optional = false)
    @NotNull(message = "Veuillez saisir un Role")
    @NotBlank(message = "Veuillez saisir un Role")
    private String roles;

    @Basic(optional = false)
    @NotNull(message = "Veuillez saisir un Password")
    @NotBlank(message = "Veuillez saisir un Password")
    private String password;

    @Basic(optional = false)
    @NotNull(message = "Veuillez saisir votre Adresse EMail")
    @NotBlank(message = "Veuillez saisir votre Adresse EMail")
    private String email;

    @Basic(optional = false)
    @NotNull(message = "Veuillez saisir votre Nom")
    @NotBlank(message = "Veuillez saisir votre Nom")
    private String nom;

    @Basic(optional = false)
    @NotNull(message = "Veuillez saisir votre Prenom")
    @NotBlank(message = "Veuillez saisir votre Prenom")
    private String prenom;

    @Basic(optional = false)
    @NotNull(message = "Veuillez saisir un Numero de Telephone")
    @NotBlank(message = "Veuillez saisir un Numero de Telephone")
    private String num_Telephone;
    
    public User() {
    }

    public User(@NotNull(message = "Veuillez saisir un Pseudo") @NotBlank(message = "Veuillez saisir un Pseudo") String username,
                @NotNull(message = "Veuillez saisir un Role") @NotBlank(message = "Veuillez saisir un Role") String roles,
                @NotNull(message = "Veuillez saisir un Password") @NotBlank(message = "Veuillez saisir un Password") String password,
                @NotNull(message = "Veuillez saisir votre Adresse EMail") @NotBlank(message = "Veuillez saisir votre Adresse EMail") String email,
                @NotNull(message = "Veuillez saisir votre Nom") @NotBlank(message = "Veuillez saisir votre Nom") String nom,
                @NotNull(message = "Veuillez saisir votre Prenom") @NotBlank(message = "Veuillez saisir votre Prenom") String prenom,
                @NotNull(message = "Veuillez saisir un Numero de Telephone") @NotBlank(message = "Veuillez saisir un Numero de Telephone") String num_Telephone) {
        this.username = username;
        this.roles = roles;
        this.password = password;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.num_Telephone = num_Telephone;
    }

    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNum_Telephone() {
		return num_Telephone;
	}
	public void setNum_Telephone(String num_Telephone) {
		this.num_Telephone = num_Telephone;
	}

}
