package com.tns.ifet.dayfive.inheritance.singleinheritance;

public class SingleInheritanceDemo {
	
	public static void main(String[] args) {
		Student student = new Student("Gayatri", "8080808080", "Bangalore", 9888878787L, 10, "City College");
		System.out.println(student);
		System.out.println(student.getName());
		System.out.println(student.getPhno());
	}
}
