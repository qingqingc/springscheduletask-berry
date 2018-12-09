package com.profile.designpattern.dynamicproxy;

public class WriterLife implements Life {

	@Override
	public String live() {
		System.out.println("In writer 'life.");
		return "This is writer's lief,take care please!";
	}

}
