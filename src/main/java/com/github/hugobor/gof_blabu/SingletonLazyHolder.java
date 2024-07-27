package com.github.hugobor.gof_blabu;

public class SingletonLazyHolder {
	
	private static SingletonLazyHolder uniqueInstance = null;
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getUniqueInstance() {
		if (uniqueInstance == null) uniqueInstance = new SingletonLazyHolder();
		return uniqueInstance;
	}

}
