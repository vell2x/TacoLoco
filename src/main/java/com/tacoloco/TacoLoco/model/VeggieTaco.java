package com.tacoloco.TacoLoco.model;

public class VeggieTaco extends Taco {
	private final double veggiePrice = 2.50;
	
	public VeggieTaco() {
		setPrice(veggiePrice);
	}
	
	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}
}
