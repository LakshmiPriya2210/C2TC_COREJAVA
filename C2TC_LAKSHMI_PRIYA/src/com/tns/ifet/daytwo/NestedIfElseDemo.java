package com.tns.ifet.daytwo;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int num=10;
		if(num%2==0) {
			if(num%5==0) {
				System.out.println("The number is even and divisible by 5");
			}
			else {
				System.out.println("The number is even but not divisible by 5");
			}
		}
		else {
			System.out.println("The number is odd");
		}

	}

}
