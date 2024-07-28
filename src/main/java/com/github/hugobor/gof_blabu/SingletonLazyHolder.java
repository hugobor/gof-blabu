package com.github.hugobor.gof_blabu;

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		private static SingletonLazyHolder uniqueInstance = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getUniqueInstance() {
		return InstanceHolder.uniqueInstance;
	}

}
