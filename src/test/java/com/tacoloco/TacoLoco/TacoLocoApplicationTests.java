package com.tacoloco.TacoLoco;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tacoloco.TacoLoco.model.BeefTaco;
import com.tacoloco.TacoLoco.model.ChickenTaco;
import com.tacoloco.TacoLoco.model.ChorizoTaco;
import com.tacoloco.TacoLoco.model.Taco;
import com.tacoloco.TacoLoco.model.VeggieTaco;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TacoLocoApplicationTests {

	@Test
	public void testVeggieTotalNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		String expected = "7.50";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testChickenTotalNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 2; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		String expected = "6.00";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBeefTotalNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 1; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		String expected = "3.00";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testChorizoTotalNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "10.50";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAllButOneVeggieNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 0; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		for(int i = 0; i < 1; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		for(int i = 0; i < 1; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		
		for(int i = 0; i < 1; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "9.50";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAllButOneChickenNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 1; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		for(int i = 0; i < 0; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		for(int i = 0; i < 1; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		
		for(int i = 0; i < 1; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "9.00";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAllButOneBeefNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 1; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		for(int i = 0; i < 1; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		for(int i = 0; i < 0; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		
		for(int i = 0; i < 1; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "9.00";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAllButOneChorizoNoDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 1; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		for(int i = 0; i < 1; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		for(int i = 0; i < 1; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		
		for(int i = 0; i < 0; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "8.50";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testOneOfEachDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 1; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		for(int i = 0; i < 1; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		for(int i = 0; i < 1; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		
		for(int i = 0; i < 1; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "9.60";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testVeggieTotalDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 25; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		String expected = "50.00";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testChickenTotalDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		String expected = "9.60";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBeefTotalDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		String expected = "24.00";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testChorizoTotalDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 600; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "1680.00";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultipleOfEachDiscount() {
		List<Taco> tacoOrder = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			Taco veggie = new VeggieTaco();
			tacoOrder.add(veggie);
		}
		for(int i = 0; i < 10; i++) {
			Taco chicken = new ChickenTaco();
			tacoOrder.add(chicken);
		}
		for(int i = 0; i < 12; i++) {
			Taco beef = new BeefTaco();
			tacoOrder.add(beef);
		}
		
		for(int i = 0; i < 6; i++) {
			Taco chorizo = new ChorizoTaco();
			tacoOrder.add(chorizo);
		}
		String expected = "77.60";
		
		String actual = Taco.totalCost(tacoOrder);
		
		assertEquals(expected, actual);
	}
}
