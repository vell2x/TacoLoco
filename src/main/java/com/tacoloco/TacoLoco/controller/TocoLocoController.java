package com.tacoloco.TacoLoco.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tacoloco.TacoLoco.dao.AppResponse;
import com.tacoloco.TacoLoco.model.BeefTaco;
import com.tacoloco.TacoLoco.model.ChickenTaco;
import com.tacoloco.TacoLoco.model.ChorizoTaco;
import com.tacoloco.TacoLoco.model.Taco;
import com.tacoloco.TacoLoco.model.VeggieTaco;

@RestController
public class TocoLocoController {
	@RequestMapping("/")
	public AppResponse Sample(@RequestParam(value = "name",
	defaultValue = "Taco") String name, @RequestParam(value = "quantity",
			defaultValue = "0") int quantity) {
		Taco taco;
		
		if(name.equalsIgnoreCase("beef")) {
			taco = new BeefTaco(quantity);
		}
		else if(name.equalsIgnoreCase("chicken")) {
			taco = new ChickenTaco(quantity);
		}
		else if(name.equalsIgnoreCase("veggie")) {
			taco = new VeggieTaco(quantity);
		}
		else if(name.equalsIgnoreCase("chorizo")) {
			taco = new ChorizoTaco(quantity);
		}
		else {
			name = "Invalid name";
			AppResponse response = new AppResponse();
			response.setId((long)0);
			response.setName(name);
			response.setQuantity(0);
			response.setTotal("0");
			return response;
		}
		
		AppResponse response = new AppResponse();
		response.setId((long)1);
		response.setName(name);
		response.setQuantity(quantity);
		response.setTotal(Taco.totalCost(taco, quantity));
		return response;

	}
}
