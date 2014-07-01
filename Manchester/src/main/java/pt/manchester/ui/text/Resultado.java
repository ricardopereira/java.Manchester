package pt.manchester.ui.text;

import pt.manchester.logic.Areas.Area;

public class Resultado {
	private Area area;
	
	public Resultado(Area area) {
		this.area = area;
	}
	
	public Area getArea() {
		return area;
	}
	
	public void setArea(Area value) {
		area = value;
	}
}