package com.github.hugobor.gof_blabu.singleton;

import java.util.HashSet;

import com.github.hugobor.gof_blabu.Person;
import com.github.hugobor.gof_blabu.Stuff;

public class PersonSingleton {

	private static class InstanceHolder {
		private static Person uniqueInstance = new Person("GOD", "Deus!", Integer.MAX_VALUE, new HashSet<Stuff>());
	}

	private PersonSingleton() {
			super();
		}

	public static Person getUniqueInstance() {
		return InstanceHolder.uniqueInstance;
	}

}
