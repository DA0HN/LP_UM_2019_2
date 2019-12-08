package inheritanceProductProblem.entities;

public class ImportedProduct extends Product {
	
	private Double customsFree;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}
	
	@Override public String priceTag() {
		return this.getName() + " $"
					+ this.totalPrice()
					+ "(Customs Fee: $"
					+ String.format("%.2f", this.customsFree)
					+ " )";
	}
	
	public Double totalPrice() {
		return this.getPrice() + this.customsFree;
	}
	
	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
}
