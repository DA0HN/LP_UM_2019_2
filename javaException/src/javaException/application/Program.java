package javaException.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program...");
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.println("Insira nomes: ");
			
			String[] str = in.nextLine().split(" ");
			int position = in.nextInt();
			
			System.out.println(str[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			in.next();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input!");
		}
		in.close();
		System.out.println("***METHOD2 END***");
	}
}
