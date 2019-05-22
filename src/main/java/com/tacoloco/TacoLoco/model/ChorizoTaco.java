package com.tacoloco.TacoLoco.model;

public class ChorizoTaco extends Taco {
	private final double chorizoPrice = 3.50;
	
	public ChorizoTaco() {
		setPrice(chorizoPrice);
	}

	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}

}
