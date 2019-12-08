package curso;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		//String sentence = input.nextLine();
		
		String r, g, b;
		r = input.next();
		g = input.next();
		b = input.next();
		System.out.println(r);
		System.out.println(g);
		System.out.println(b);
		
		input.close();
	}

}
