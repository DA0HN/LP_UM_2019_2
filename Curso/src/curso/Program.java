package curso;

import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		char gender = 'f';
		int age = 19;
		double balance = 10.35784;
		String name = "Honda";
		System.out.println("OHMYFOCKINGGODDUDE!");
		System.out.println("HOOOOOOLY SHIT");
		// sysout & ctrl + space 
		System.out.println("-------------------------------");
		System.out.printf("%.2f is my balance!%n", balance);
		System.out.printf("%.3f is my balance!%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f is my balance on US money!%n", balance);
		System.out.println("-------------------------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age, gender, balance);
	}
}
