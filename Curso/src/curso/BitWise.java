package curso;

import java.util.Scanner;

public class BitWise {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mask = 0b00100000;
		int number = in.nextInt();
		if( (number & mask) != 0 ) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		in.close();
	}
}
