package javaException.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		File file = new File("C:\\temp\\in.txt");
		Scanner reader = null;
		try {
			reader = new Scanner(file);
			while( reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if( reader != null ) {
				reader.close();
			}
			
			System.out.println("Finally block executed");
			
		}
	}
}
