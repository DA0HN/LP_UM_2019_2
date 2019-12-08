package inheritanceProductProblem.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override public String priceTag(){
		return  this.getName() +
				" (used) " +
				"$" +
				String.format("%.2f ", this.getPrice())
				+ "(Manufacture date: "
				+ this.sdf.format(this.manufactureDate);
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		try {
			this.manufactureDate = this.sdf.parse(manufactureDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
}
