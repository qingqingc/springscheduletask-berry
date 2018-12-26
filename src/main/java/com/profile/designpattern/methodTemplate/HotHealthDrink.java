package com.profile.designpattern.methodTemplate;

public class HotHealthDrink extends AbstractDrink {

	@Override
	public void addColdWater() {
		System.out.println("I need a cold drink.20%");
	}

	@Override
	public void addHotWater() {
		System.out.println("I need a hot drink.80%");
		
	}
	
	@Override
	public void commonM() {
		System.out.println("This Hot's common.");
	}

}
