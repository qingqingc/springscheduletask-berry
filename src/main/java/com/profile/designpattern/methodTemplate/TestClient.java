package com.profile.designpattern.methodTemplate;

public class TestClient {
	public static void main(String[] args) {
		AbstractDrink hot = new HotHealthDrink();
		AbstractDrink cold = new ColdDrinkForStrongMan();
		hot.drink();
		System.out.println("--------------------");
		cold.drink();
	}
}
