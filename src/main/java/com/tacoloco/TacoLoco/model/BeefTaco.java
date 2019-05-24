package com.tacoloco.TacoLoco.model;


public class BeefTaco extends Taco {
	private final double beefPrice = 3.00;
	private int quantity;
	private String url;

	public BeefTaco() {
		super();
		setPrice(beefPrice);
	}
	
	public BeefTaco(int quantity) {
		this();
		this.quantity = quantity;
		setPrice(beefPrice, quantity);
		
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBeefPrice() {
		return beefPrice;
	}

	@Override
	public void setPrice(double tacoPrice) {
		super.price = tacoPrice;
	}

	public void setPrice(double tacoPrice, int quantity) {
		super.price = tacoPrice * quantity;
	}
}
