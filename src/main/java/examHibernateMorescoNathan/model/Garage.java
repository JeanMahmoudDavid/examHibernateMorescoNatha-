package examHibernateMorescoNathan.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "garage")
public class Garage {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private String user_id;

    @Column(name = "nom", nullable = false)
    @NotNull(message = "Veuillez saisir un Nom")
    @NotBlank(message = "Veuillez saisir un Nom")
    private String nom;

    @Column(name = "rue", nullable = false)
    @NotNull(message = "Veuillez saisir une Rue")
    @NotBlank(message = "Veuillez saisir une Rue")
    private String rue;

    @Column(name = "code_postal", nullable = false)
    @NotNull(message = "Veuillez saisir un Code Postal")
    @NotBlank(message = "Veuillez saisir un Code Postal")
    private String code_postal;

    @Column(name = "ville", nullable = false)
    @NotNull(message = "Veuillez saisir une Ville")
    @NotBlank(message = "Veuillez saisir une Ville")
    private String ville;

    @Column(name = "num_telephone", nullable = false)
    @NotNull(message = "Veuillez saisir un Numero de Telephone")
    @NotBlank(message = "Veuillez saisir un Numero de Telephone")
    private String num_telephone;

    @Column(name = "num_siret", nullable = false)
    @NotNull(message = "Veuillez saisir le Numero de SIRET")
    @NotBlank(message = "Veuillez saisir le Numero de SIRET")
    private String num_siret;

    public Garage() {
    }

    public Garage(String user_id, String nom, String rue, String code_postal, String ville, String num_telephone, String num_siret) {
    	this.user_id = user_id;
    	this.nom = nom;
    	this.rue = rue;
    	this.code_postal = code_postal;
    	this.ville = ville;
    	this.num_telephone = num_telephone;
    	this.num_siret = num_siret;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNum_telephone() {
		return num_telephone;
	}

	public void setNum_telephone(String num_telephone) {
		this.num_telephone = num_telephone;
	}

	public String getNum_siret() {
		return num_siret;
	}

	public void setNum_siret(String num_siret) {
		this.num_siret = num_siret;
	}

}
