package com.tacoloco.TacoLoco.model;


public class VeggieTaco extends Taco {
	private final double veggiePrice = 2.50;
	private int quantity;
	private String url;
	
	public VeggieTaco() {
		super();
		setPrice(veggiePrice);
	}
	
	public VeggieTaco(int quantity) {
		this();
		this.quantity = quantity;
		setPrice(veggiePrice, quantity);
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

	public double getVeggiePrice() {
		return veggiePrice;
	}

	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}
	
	public void setPrice(double tacoPrice, int quantity) {
		super.price = tacoPrice * quantity;
	}
}
