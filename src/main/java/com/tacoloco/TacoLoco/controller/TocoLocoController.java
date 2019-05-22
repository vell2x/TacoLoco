package com.tacoloco.TacoLoco.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tacoloco.TacoLoco.model.BeefTaco;
import com.tacoloco.TacoLoco.model.ChickenTaco;
import com.tacoloco.TacoLoco.model.ChorizoTaco;
import com.tacoloco.TacoLoco.model.Taco;
import com.tacoloco.TacoLoco.model.VeggieTaco;

@Controller
public class TocoLocoController {
	@RequestMapping("/")
	public ModelAndView showHome() {
		return new ModelAndView("/index");
	}
	
	@PostMapping("/receipt")
	public ModelAndView receipt(int veggieTaco, int chickenTaco,
			int beefTaco, int chorizoTaco) {
		List<Taco> tacoOrder = new ArrayList<>();

		// Adds veggie order to list one object at a time
		for(int i = 0; i < veggieTaco; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		
		// Adds chicken order to list one object at a time
		for(int i = 0; i < chickenTaco; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		
		// Adds beef order to list one object at a time
		for(int i = 0; i < beefTaco; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		
		// Adds chorizo order to list one object at a time
		for(int i = 0; i < chorizoTaco; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		
		String totalCost = Taco.totalCost(tacoOrder);
		
		return new ModelAndView("/receipt-page", "total", totalCost);
	}
}
