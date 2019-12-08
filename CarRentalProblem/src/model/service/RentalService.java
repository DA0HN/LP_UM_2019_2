package model.service;

import model.entities.CarRental;
import model.entities.Invoice;
import model.service.interfaces.TaxService;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;
	
	public RentalService() {}

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long instant1 = carRental.getStart().getTime();	// pega o valor em milisegundos da data
		long instant2 = carRental.getFinish().getTime(); // pega o valor em milisegundos da data
		double hours = (double) (instant2 - instant1) / 1000 / 60 / 60;
		
		double basicPayment = 0.0;
		
		if( hours <= 12.0 ) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice( new Invoice(basicPayment, tax) );
	}
	
}
