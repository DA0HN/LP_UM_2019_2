package keyboard.util;

import java.util.Scanner;

public class Keyboard {
	
	@SuppressWarnings("resource")
	public static String readString(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextLine();
	}
	
	@SuppressWarnings("resource")
	public static Integer readInteger(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextInt();
	}
	
	@SuppressWarnings("resource")
	public static Double readDouble(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextDouble();
	}
	@SuppressWarnings("resource")
	public static Character readCharacter(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextLine().charAt(0);
	}
	
	/* Passa uma variável e ela recebe o valor no próprio método */
	
	@SuppressWarnings("resource")
	public static void readString(String message, String value) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		value = scan.nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void readInteger(String message, Integer value) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		value = scan.nextInt();
	}
	
	@SuppressWarnings("resource")
	public static void readDouble(String message, Double value) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		value = scan.nextDouble();
	}
	
	@SuppressWarnings("resource")
	public static void readCharacter(String message, Character value) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		value = scan.nextLine().charAt(0);
	}
	
}
