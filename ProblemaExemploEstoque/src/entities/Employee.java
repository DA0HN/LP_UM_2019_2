package entities;

public class Employee {
	public String name;
	public int id;
	public double grossSalary;
	public double tax;
	
	public Employee() {
		this(123, "garibaldo", 1500);
	}
	
	public Employee(int id,String name,double grossSalary){
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}
	
	public int getId() {
		return id;
	}

	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double porcentage) {
		grossSalary += grossSalary * (porcentage/100);
	}
	public String toString() {
		return  "id: "
				+ id 
				+ ", "
				+ name
				+ ", "
				+ " $"
				+ String.format("%.2f", netSalary());
	}
}
