package exceptionExercise.application;

public class Main {
	public static void main(String[] args) {
		try {
			
		}
		catch(NullPointerException e) {
			System.out.println("Withdraw error: " + e.getMessage() );
		}
		catch( IllegalArgumentException e) {
			System.out.println("Withdraw error: " + e.getMessage() );
		}
	}
}
