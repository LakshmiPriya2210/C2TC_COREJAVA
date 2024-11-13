package com.tns.ifet.daysix.staticvariable;

public class Employee {
	static String companyName = "TNS";

	String name;
	int id;
	
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}
}
