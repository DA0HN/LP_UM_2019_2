package defenderMethods.interfaces;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();

	default double payment(double amount, int month) {
		if( month < 1 ) {
			throw new InvalidParameterException("Months must be greater than zero.");
		}
		return (amount) * Math.pow( ( 1 + getInterestRate() / 100 ), month) ;
	}

}
