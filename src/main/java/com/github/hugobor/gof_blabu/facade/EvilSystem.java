package com.github.hugobor.gof_blabu.facade;

import com.github.hugobor.gof_blabu.Person;
import com.github.hugobor.gof_blabu.Stuff;

public class EvilSystem {
	public EvilSystem() { super(); }
	
	public void doEvil() { System.out.println("HAHAHAHAHA!!!"); }
	
	public String evilWithName(String name) {
		var p = new Person(name, "", 0, null);
		
		var sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(p.cleanName());
		}
		
		return sb.toString();
	}
	
	public Stuff evilEvilHa(String aString) {
		return new Stuff(new Person(aString, aString, 0, null).cleanName(), evilWithName(aString));
	}
}
