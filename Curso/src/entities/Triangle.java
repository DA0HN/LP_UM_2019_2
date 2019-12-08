package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double perimeter() {
		return ((this.a + this.b + this.c)/2);
	}
	public double area() {
		return(Math.sqrt(perimeter()*
				(perimeter() - this.a)*
				(perimeter() - this.b)*
				(perimeter() - this.c)));
	}
}
