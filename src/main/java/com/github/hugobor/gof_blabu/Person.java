package com.github.hugobor.gof_blabu;

import java.text.MessageFormat;
import java.util.Set;

public record Person(
		String name,
		String descr,
		int age,
		Set<Stuff> backpack) {
	
	static private String clean(String aString) {
		if (aString.isBlank()) return aString;
		
		var lower = aString.strip().toLowerCase();
		return lower.substring(0, 1).toUpperCase().concat(lower.substring(1, lower.length()));
	}
	
	public String cleanName() { return clean(name); }
	
	public String kiss(Person person) {
		return MessageFormat.format("{0} deu um beijinho em {1}!!!", this.cleanName(), person.cleanName()); 
	}
}
