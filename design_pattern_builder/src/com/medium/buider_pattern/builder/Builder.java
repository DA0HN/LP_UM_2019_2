package com.medium.buider_pattern.builder;

import com.medium.buider_pattern.model.Person;

public class Builder {

	private  String firstName;
	private  String middleName;
	private  String lastName;
	private  Integer age;
	private  String fathersName;
	private  String mothersName;
	private  Double height;
	private  Double weight;
	
	public Builder() {}
	
	public Builder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public Builder setFathersName(String fathersName) {
		this.fathersName = fathersName;
		return this;
	}
	public Builder setMothersName(String mothersName) {
		this.mothersName = mothersName;
		return this;
	}
	public Builder setHeight(Double height) {
		this.height = height;
		return this;
	}
	public Builder setWeight(Double weight) {
		this.weight = weight;
		return this;
	}
	public Builder setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}
	public Builder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public Builder setAge(Integer age) {
		this.age = age;
		return this;
	}
	
	public Person build() {
		return new Person(this.firstName, this.middleName,
				this.lastName, this.age, this.fathersName,
				this.mothersName, this.height, this.weight);
	}
	public Builder clean() {
		firstName = null;
		middleName = null;
		lastName = null;
		age = null;
		fathersName = null;
		mothersName = null;
		weight = null;
		height = null;
		return this;
	}
}
