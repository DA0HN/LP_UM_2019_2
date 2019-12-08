package exceptionExercise.model.entities;

import com.sun.jdi.AbsentInformationException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getWithDrawLimit() {
		return withdrawLimit;
	}

	public void setWithDrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		
	}
	
	public void withdraw(Double amount) {
		if( this.balance == 0 ) {
			throw new NullPointerException("");
		}
		if( amount > this.withdrawLimit ) {
			throw new IllegalArgumentException("The amount exceeds withdraw limit.");
		}
		this.balance -= amount;
	}
	
	
}
