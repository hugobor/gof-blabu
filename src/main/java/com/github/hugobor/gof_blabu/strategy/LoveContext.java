package com.github.hugobor.gof_blabu.strategy;

import com.github.hugobor.gof_blabu.Person;

public class LoveContext implements LoveStrategy {
	
	private final Person person;
	private LoveStrategy loveStrategy;
	
	public LoveStrategy getLoveStrategy() {	return loveStrategy; }
	public void setLoveStrategy(LoveStrategy loveStrategy) { this.loveStrategy = loveStrategy; }
	public Person getPerson() { return person; }
	
	
	public LoveContext(Person person) {
		super();
		this.person = person;
		this.loveStrategy = new BoringStrategy();
	}
	
	public LoveContext(Person person, LoveStrategy loveStrategy) {
		super();
		this.person = person;
		this.loveStrategy = loveStrategy;
	}
	@Override
	public void love(Person aPerson) {
		System.out.format("%s disse: ", this.person.cleanName());
		this.loveStrategy.love(aPerson);
		System.out.println();
	}
	
	
	
	
	
	
	
	

}
