package com.tacoloco.TacoLoco.model;

public class ChickenTaco extends Taco {
	private final double chickenPrice = 3.00;
	
	public ChickenTaco() {
		setPrice(chickenPrice);
	}

	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}

}
