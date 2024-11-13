package com.tns.ifet.finalkeyword;

public class FinalVariableDemo {
	final int speedlimit=90;//final variable  

	void run(){  

		speedlimit=400;  

	}  

	public static void main(String args[]){  

		FinalVariableDemo obj=new  FinalVariableDemo();  

		obj.run();  

	} 
}
