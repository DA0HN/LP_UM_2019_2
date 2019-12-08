package util;

import java.util.Scanner;

public class Teclado {
	public static String leString(String rotulo) {
		Scanner scan = new Scanner(System.in);
		System.out.println(rotulo);
		return scan.nextLine();
	}
	public static int leInt(String rotulo) {
		Scanner scan = new Scanner(System.in);
		System.out.println(rotulo);
		return scan.nextInt();
	}
	public static double leDouble(String rotulo) {
		Scanner scan = new Scanner(System.in);
		System.out.println(rotulo);
		return scan.nextDouble();
	}
}