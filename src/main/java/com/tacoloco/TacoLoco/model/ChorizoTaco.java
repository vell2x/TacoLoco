package com.tacoloco.TacoLoco.model;


public class ChorizoTaco extends Taco {
	private final double chorizoPrice = 3.50;
	private int quantity;
	private String url;
	
	public ChorizoTaco() {
		super();
		setPrice(chorizoPrice);
	}
	
	public ChorizoTaco(int quantity) {
		this();
		this.quantity = quantity;
		setPrice(chorizoPrice, quantity);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public double getChorizoPrice() {
		return chorizoPrice;
	}

	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}
	
	public void setPrice(double tacoPrice, int quantity) {
		super.price = tacoPrice * quantity;
	}

}
