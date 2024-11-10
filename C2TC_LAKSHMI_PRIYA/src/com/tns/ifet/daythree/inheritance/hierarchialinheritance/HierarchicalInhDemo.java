package com.tns.ifet.daythree.inheritance.hierarchialinheritance;

public class HierarchicalInhDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Priya", "Cuddalore");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Praveen", "Cuddalore", 100, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Pankaj", "Pondy", "AB", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}
}
