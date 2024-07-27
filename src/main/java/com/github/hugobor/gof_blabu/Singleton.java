package com.github.hugobor.gof_blabu;

public class Singleton {
	
	private static class InstanceHolder {
		public static Singleton uniqueInstance = new Singleton();
	}
	
	private Singleton() {
		super();
	}
	
	public static Singleton getUniqueInstance() {
		return InstanceHolder.uniqueInstance;
	}

}
