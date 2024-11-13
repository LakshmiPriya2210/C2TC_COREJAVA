package com.tns.ifet.finalkeyword;

public class FinalMethodDemo extends FinalMethod {
	void run(){
		System.out.println("running safely with 100kmph");
	}

	public static void main(String args[]){
		FinalMethod obj=new FinalMethod();
		obj.run();
	}  

}
