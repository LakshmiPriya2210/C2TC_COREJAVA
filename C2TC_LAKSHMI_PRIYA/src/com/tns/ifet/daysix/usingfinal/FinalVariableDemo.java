package com.tns.ifet.daysix.usingfinal;

final class FinalVariable {
	final static int x=10;
	final static int y;
	final static int z=40;
	void change() {
		x=30;
		y=50;
	}
	@Override
	public String toString() {
		return "FinalVariable [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	static {
		y=20;
		z=60;
		System.out.println("Y="+y);
	}
}

public class FinalVariableDemo{
	public static void main() {
		FinalVariable obj=new FinalVariable();
		System.out.println(obj.change());
	}
}
