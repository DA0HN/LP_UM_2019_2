package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilTaxService;
import model.service.RentalService;
import teclado.Teclado;

public class App {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data: ");
		
		String carModel = Teclado.leString("Car model: ");
		Date start = sdf.parse( Teclado.leString("Pickup (dd/MM/yyyy HH:ss): ") );
		Date finish = sdf.parse( Teclado.leString("Return (dd/MM/yyyy HH:ss):") );
		
		
		CarRental rental = new CarRental(start, finish, new Vehicle(carModel) );
		
		double pricePerHour = Teclado.leDouble("Enter price per hour: ");
		double pricePerDay = Teclado.leDouble("Enter price per day: ");
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
	
		rentalService.processInvoice(rental);
		
		System.out.println("INVOICE: ");
		System.out.println("Basic payment: " + String.format("%.2f",rental.getInvoice().getBasicPayment()) );
		System.out.println("Tax: " + String.format("%.2f",rental.getInvoice().getTax()) );
		System.out.println("Total payment: " + String.format("%.2f",rental.getInvoice().getTotalPayment()) );
		
	}

}
