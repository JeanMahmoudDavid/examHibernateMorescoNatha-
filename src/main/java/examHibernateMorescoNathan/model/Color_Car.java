package examHibernateMorescoNathan.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Color_Car {

	@ManyToOne
	 @JoinColumn(name = "color_id", referencedColumnName = "id")
	private Integer color_id;
	
	@ManyToOne
	@JoinColumn(name = "car_id", referencedColumnName = "id")
	private Integer car_id;

	public Integer getColor_id() {
		return color_id;
	}
	public void setColor_id(Integer color_id) {
		this.color_id = color_id;
	}

	public Integer getCar_id() {
		return car_id;
	}
	public void setCar_id(Integer car_id) {
		this.car_id = car_id;
	}	
}