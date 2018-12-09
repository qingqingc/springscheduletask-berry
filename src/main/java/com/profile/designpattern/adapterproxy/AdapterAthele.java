package com.profile.designpattern.adapterproxy;

public class AdapterAthele implements Athlete {

	@Override
	public void run() {
		System.out.println("running just so so.");

	}

	@Override
	public void jump() {
		System.out.println("jumping just so so.");

	}

	@Override
	public void swim() {
		System.out.println("swimming just so so.");
	}

}
