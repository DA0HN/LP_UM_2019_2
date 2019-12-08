package comInterface.model.entities;

import comInterface.util.enums.Color;

public abstract class ColoredShape implements Shape{
	
	private Color color;
	
	public ColoredShape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
