package com.github.hugobor.gof_blau.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.github.hugobor.gof_blabu.Person;

class BlabuTest {
	
	private static void penes() {
		var hugo = new Person("Hugo", "Programador incrível!!!", 32, Set.of());
		var house = new Person("House", "Cachorro vira-lata", 13, Set.of());
		
		Consumer<Object> p = System.out::println;
		p.accept(hugo);
		p.accept(house);
		p.accept(hugo.kiss(house));
	}
	
	@Test
	void testPenes() {
		BlabuTest.penes();
	}

	@Test
	void testBlabu() {
		assertTrue(true, "Tudo deu bom!!!");
		
		
	}
	
	

	

	
	@Disabled("NOFIX porquê eu odeio a minha vida")
	@Test
	void testBenes() {
		assertTrue(false, "Sadge :(");
	}

}
