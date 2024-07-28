package com.github.hugobor.gof_blabu;

import java.text.MessageFormat;

public record Stuff(
		String name,
		String nothing) {
	
	public Stuff(String name) {
		this(name, MessageFormat.format("Uma coisa “{0}”!!!", name));
	}

}
