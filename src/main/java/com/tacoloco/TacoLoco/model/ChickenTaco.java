package com.tacoloco.TacoLoco.model;


public class ChickenTaco extends Taco {
	private final double chickenPrice = 3.00;
	private int quantity;
	private String url;
	
	public ChickenTaco() {
		super();
		setPrice(chickenPrice);
	}
	
	public ChickenTaco(int quantity) {
		this();
		this.quantity = quantity;
		setPrice(chickenPrice, quantity);
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

	public double getChickenPrice() {
		return chickenPrice;
	}

	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}

	public void setPrice(double tacoPrice, int quantity) {
		super.price = tacoPrice * quantity;
	}
}
