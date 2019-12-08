package com.medium.buider_pattern.model;

import com.medium.buider_pattern.builder.Builder;

public class Person {

	public static Builder builder = new Builder();
	
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer age;
	private String fathersName;
	private String mothersName;
	private Double height;
	private Double weight;
	
	public Person(String firstName, String middleName, String lastName, Integer age, String fathersName,
			String mothersName, Double height, Double weight) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.height = height;
		this.weight = weight;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", age="
				+ age + ", fathersName=" + fathersName + ", mothersName=" + mothersName + ", height=" + height
				+ ", weight=" + weight + "]";
	}
}
