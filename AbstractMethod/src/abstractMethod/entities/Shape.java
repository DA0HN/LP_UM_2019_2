package abstractMethod.entities;

import abstractMethod.util.enums.Color;
/*
 * Se a classe possui ao menos 1 método abstrato
 * ela também será abstrata
 */
public abstract class Shape {
	Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract Double area();
}
