package com.tacoloco.TacoLoco.model;

public class BeefTaco extends Taco {
	private final double beefPrice = 3.00;
	
	public BeefTaco() {
		setPrice(beefPrice);
	}

	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}

}
