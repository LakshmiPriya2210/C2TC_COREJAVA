package com.tns.ifet.daythree.encapsulation;

public class OopsConceptDemo {
	private int rollNum;
	private String name;
	private int age;
	
	
	public int getRollNum() {
		return rollNum;
	}


	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "OopsConceptDemo [rollNum=" + rollNum + ", name=" + name + ", age=" + age + "]";
	}
}
