package com.profile.designpattern.dynamicproxy;

public class DevelopLife implements Life {

	@Override
	public String live() {

		System.out.println("In developer'life.");
		return "This is developer'life,Do you want to know me?";
	}

}
