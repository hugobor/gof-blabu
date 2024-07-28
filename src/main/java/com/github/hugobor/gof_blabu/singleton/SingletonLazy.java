package com.github.hugobor.gof_blabu.singleton;

public class SingletonLazy {
	private static SingletonLazy uniqueInstance = null;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getUniqueInstance() {
		if (uniqueInstance == null) uniqueInstance = new SingletonLazy();
		return uniqueInstance;
	}

}
