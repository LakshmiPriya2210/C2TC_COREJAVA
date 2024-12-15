package com.tns.ifet.dayeight.interfaces.instanceofinterfaces;

public class Samsung implements Phone{
	@Override
	public void call() {
		System.out.println("Calling using Samsung");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Samsung");

	}
}
