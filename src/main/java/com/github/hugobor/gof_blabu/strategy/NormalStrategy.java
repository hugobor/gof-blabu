package com.github.hugobor.gof_blabu.strategy;

import com.github.hugobor.gof_blabu.Person;

public class NormalStrategy implements LoveStrategy {

	@Override
	public void love(Person aPerson) {
		System.out.format("Eu amo o %s!!!", aPerson.cleanName());
	}
	
}
