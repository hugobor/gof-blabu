package com.github.hugobor.gof_blau.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.hugobor.gof_blabu.Person;
import com.github.hugobor.gof_blabu.Stuff;
import com.github.hugobor.gof_blabu.singleton.PersonSingleton;
import com.github.hugobor.gof_blabu.strategy.BoringStrategy;
import com.github.hugobor.gof_blabu.strategy.EmojiStrategy;
import com.github.hugobor.gof_blabu.strategy.HateNotLoveStrategy;
import com.github.hugobor.gof_blabu.strategy.LoveContext;
import com.github.hugobor.gof_blabu.strategy.NormalStrategy;

class BlabuTest {
		
	@Test
	void testPenes() {
		var hugo = new Person("Hugo", "Programador incrível!!!", 32, Set.of());
		var house = new Person("House", "Cachorro vira-lata", 13, Set.of());
		
		Consumer<Object> p = System.out::println;
		p.accept(hugo);
		p.accept(house);
		p.accept(hugo.kiss(house));
		
		Person god = PersonSingleton.getUniqueInstance();
		p.accept(god);
		
		god.backpack().addAll(Set.of("ɑ", "Ω", "Universo").stream().map(Stuff::new).toList());
		p.accept(god);
		
		assertEquals(god, PersonSingleton.getUniqueInstance());
		assertSame(god, PersonSingleton.getUniqueInstance());
	}

	@Test
	void testBlabu() {
		assertTrue(true, "Tudo deu bom!!!");
	}
	
	@Test
	@DisplayName("OOOOOIIIE")
	void testStrategy() {
		assertTrue(true);
		
		var hugo = new Person("Hugo", "Programador incrível!!!", 32, Set.of());
		var house = new Person("House", "Cachorro vira-lata", 13, Set.of());
		Consumer<Object> p = System.out::println;
	
		var hugoLove = new LoveContext(hugo, new BoringStrategy());
		hugoLove.love(house);
		hugoLove.setLoveStrategy(new EmojiStrategy());
		hugoLove.love(house);
		hugoLove.love(house);
		
		hugoLove.setLoveStrategy(new HateNotLoveStrategy());
		hugoLove.love(PersonSingleton.getUniqueInstance());
		
		hugoLove.setLoveStrategy(new NormalStrategy());
		hugoLove.love(PersonSingleton.getUniqueInstance());
		
		
	}
	

	

	
	@Disabled("NOFIX porquê eu odeio a minha vida")
	@Test
	void testBenes() {
		assertTrue(false, "Sadge :(");
	}

}
