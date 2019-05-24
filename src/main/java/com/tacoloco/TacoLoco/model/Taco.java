package com.tacoloco.TacoLoco.model;

import java.util.List;


public abstract class Taco {
	
	
	protected double price;
		
	public Taco() {
	}

	public double getPrice() {
		return price;
	}

	public abstract void setPrice(double tacoPrice);

	public static String totalCost(List<Taco>tacoOrder) {
		double total = 0.0;
		
		for(Taco t : tacoOrder) {
			total += t.getPrice();
		}
		
		if(tacoOrder.size() >= 4) {
			total -= (total * 0.2); 
		}
			
		return String.format("%.2f", total);
	}
	
	public static String totalCost(Taco tacoOrder, int quantity) {
		double total = 0.0;
		
		total += tacoOrder.getPrice();
		
		if(quantity >= 4) {
			total -= (total * 0.2); 
		}
			
		return String.format("%.2f", total);
	}
}
