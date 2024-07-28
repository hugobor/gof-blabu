package com.github.hugobor.gof_blabu.strategy;

import com.github.hugobor.gof_blabu.Person;

public class HateNotLoveStrategy implements LoveStrategy {

	@Override
	public void love(Person aPerson) {
		System.out.format("Eu odeio o %s!!! 😡", aPerson.cleanName());
	}
	
}
