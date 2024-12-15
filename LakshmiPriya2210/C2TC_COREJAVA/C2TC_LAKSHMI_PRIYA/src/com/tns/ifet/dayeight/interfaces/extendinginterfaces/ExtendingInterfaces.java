package com.tns.ifet.dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfaces implements ChildInterface {
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}
