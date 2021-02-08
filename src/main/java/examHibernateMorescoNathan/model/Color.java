package examHibernateMorescoNathan.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "color")
public class Color {

	@Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "libelle", nullable = false)
    @NotNull(message = "Veuillez saisir un Libelle")
    @NotBlank(message = "Veuillez saisir un Libelle")
	private String libelle;

	
	public Color() {
	}
	
	public Color(@NotNull(message = "Veuillez saisir un Libelle") @NotBlank(message = "Veuillez saisir un Libelle") String libelle) {
		this.libelle = libelle;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
