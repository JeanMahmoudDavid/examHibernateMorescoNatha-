package examHibernateMorescoNathan.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "garage_id", referencedColumnName = "id")
    private String garage_id;

	@Column(name = "marque", nullable = false)
    @NotNull(message = "Veuillez saisir une Marque")
    @NotBlank(message = "Veuillez saisir une Marque")
    private String marque;

    @Column(name = "modele", nullable = false)
    @NotNull(message = "Veuillez saisir un Modele")
    @NotBlank(message = "Veuillez saisir un Modele")
    private String modele;

    @Column(name = "carburant", nullable = false)
    @NotNull(message = "Veuillez saisir un Carburant")
    @NotBlank(message = "Veuillez saisir un Carburant")
    private String carburant;

    @Column(name = "annee", nullable = false)
    @NotNull(message = "Veuillez saisir une Annee")
    @NotBlank(message = "Veuillez saisir une Annee")
    private Integer annee;

    @Column(name = "kilometrage", nullable = false)
    @NotNull(message = "Veuillez saisir le Kilometrage")
    @NotBlank(message = "Veuillez saisir le Kilometrage")
    private Integer kilometrage;

    @Column(name = "prix", nullable = false)
    @NotNull(message = "Veuillez saisir le prix")
    @NotBlank(message = "Veuillez saisir le prix")
    private Integer prix;

    @Column(name = "date_ajout", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull(message = "Veuillez saisir une Date d'ajout")
    @NotBlank(message = "Veuillez saisir une Date d'ajout")
    private Date date_ajout;
    
    @Column(name = "description", nullable = false)
    @NotNull(message = "Veuillez saisir une Description")
    @NotBlank(message = "Veuillez saisir une Description")
    private String description;
    
    public Car() {
    }
    
    public Car(String garage_id, String marque, String modele, String carburant, Integer annee, Integer kilometrage,
			Integer prix, Date date_ajout, String description) {
    	
		this.garage_id = garage_id;
		this.marque = marque;
		this.modele = modele;
		this.carburant = carburant;
		this.annee = annee;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.date_ajout = date_ajout;
		this.description = description;
	}

	public String getGarage_id() {
		return garage_id;
	}

	public void setGarage_id(String garage_id) {
		this.garage_id = garage_id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Integer getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(Integer kilometrage) {
		this.kilometrage = kilometrage;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public Date getDate_ajout() {
		return date_ajout;
	}

	public void setDate_ajout(Date date_ajout) {
		this.date_ajout = date_ajout;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
