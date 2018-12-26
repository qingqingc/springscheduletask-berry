package com.profile.designpattern.methodTemplate;

public abstract class AbstractDrink {
	public void drink() {
		System.out.println("it's a liquid.");
		addColdWater();
		addHotWater();
		commonM();
	}
	
	public abstract void addColdWater();
	public abstract void addHotWater();
	public void health() {
		System.out.println("every one need to drink everyday.");
	}
	public void commonM() {
		System.out.println("This father 's common.");
	}
}