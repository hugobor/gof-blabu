package com.github.hugobor.gof_blabu.strategy;

import com.github.hugobor.gof_blabu.Person;

public class EmojiStrategy implements LoveStrategy {

	@Override
	public void love(Person aPerson) {
		System.out.format("%s 😍", aPerson.cleanName());
	}
	
}
