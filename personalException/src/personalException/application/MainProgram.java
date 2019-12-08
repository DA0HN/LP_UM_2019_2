package personalException.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import personalException.model.entities.Reservation;
import personalException.model.exception.DomainException;
import teclado.Teclado;

public class MainProgram {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {

			int number = Teclado.leInt("Room number: ");
			
			Date checkIn = sdf.parse( Teclado.leString("Check-in date (dd/MM/yyyy): ") );
			Date checkOut = sdf.parse( Teclado.leString("Check-out date (dd/MM/yyyy): ") );
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
			
			System.out.println("Enter data to update the reservation: ");
			
			checkIn = sdf.parse( Teclado.leString("Check-in date (dd/MM/yyyy): ") );
			checkOut = sdf.parse( Teclado.leString("Check-out date (dd/MM/yyyy): ") );
		
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch( ParseException e ) {
			System.out.println("Invalid date format.");
		}
		catch( DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage() );
		}
		catch( RuntimeException e) {
			System.out.println("Unexpected error.");
		}
	}

}
