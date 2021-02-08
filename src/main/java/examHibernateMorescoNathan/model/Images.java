package examHibernateMorescoNathan.model;

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
@Table(name = "images")
public class Images {

	@Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom", nullable = false)
    @NotNull(message = "Veuillez saisir un Nom")
    @NotBlank(message = "Veuillez saisir un Nom")
	private String nom;
	
	@ManyToOne()
    @JoinColumn(name = "car_id", referencedColumnName = "id")
	private Integer car_id;

	public Images() {
	}
	
	public Images(String nom, Integer car_id) {
		this.nom = nom;
		this.car_id = car_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCar_id() {
		return car_id;
	}

	public void setCar_id(Integer car_id) {
		this.car_id = car_id;
	}
	
}
