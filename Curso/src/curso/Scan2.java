package curso;

import java.util.Locale;
import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		in.nextLine();
		String name = in.nextLine();
		char gender = in.next().charAt(0);
		
		// codigo = b5 e guardar digitos e letras em variaveis separadas
		String str = in.next();
		char letter = str.charAt(0);
		int digit = Integer.parseInt(str.substring(1));	// converte para inteiro
		// 4.32574
		double num2 = in.nextDouble();
		// Maria F 23 1.68
		String name2 = in.next();
		char ch = in.next().charAt(0);
		int age = in.nextInt();
		double height = in.nextDouble();
		System.out.println(num1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(num2);
		System.out.printf(name2, ch, age, height);
		in.close();

	}

}
