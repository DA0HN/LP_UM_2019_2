package comInterface.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import comInterface.model.entities.Circle;
import comInterface.model.entities.Rectangle;
import comInterface.model.entities.Shape;
import comInterface.util.enums.Color;
import teclado.Teclado;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Shape> list = new ArrayList<>();
		int numberOfShape = Teclado.leInt("Enter the number of shapes: ");
		
		for(int i=0; i < numberOfShape; i++ ) {
			System.out.printf("Shape #"+ (i+1) +" data: %n");
			char shape = Teclado
						.leString("Rectangle or Circle (r/c): ")
						.charAt(0);
			Color color = Color.valueOf(Teclado.leString("Color (BLACK/BLUE/RED): ").toUpperCase());
			if( shape == 'r' ) {
				list.add( new Rectangle(
							color,
							Teclado.leDouble("Width: "),
							Teclado.leDouble("Heigth: ")
							));
			}
			else {
				list.add( new Circle(
						color,
						Teclado.leDouble("Radius: ")
						));
			}
		}
		
		
		System.out.println("SHAPE AREAS: ");
		for(Shape sh : list ) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
	}

}
