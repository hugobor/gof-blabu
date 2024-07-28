package com.github.hugobor.gof_blabu.singleton;

public class SingletonEager {
	
	private static final SingletonEager uniqueInstance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getUniqueInstance() {
		return uniqueInstance;
	}

}
