package com.profile.designpattern.adapterproxy;

public class 姚明 extends AdapterAthele implements Athlete {

	@Override
	public void jump() {
		System.out.println("我打篮球最厉害");
	}
}
