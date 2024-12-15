package com.tns.ifet.daysix.staticblockmethod;

public class MyClass {
	int a ; 
	static int b; 
	
	static
	{
		System.out.println("-----------Within Static Block---------");
		b=1000;
	}
	
	MyClass()
	{
		System.out.println("--------------Within Default Constructor-----------");
		b++;
		a++;		
	}
	
	public String toString() {
		return "MyClass [Static value "+b+", normal value=" + a + "]";
	}

	static void display() 
	{	
		System.out.println("Static value "+b); 
	}
	public static void main(String[]args) {}
	
}
