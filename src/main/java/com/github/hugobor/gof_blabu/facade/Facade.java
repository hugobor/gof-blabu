package com.github.hugobor.gof_blabu.facade;

import com.github.hugobor.gof_blabu.singleton.PersonSingleton;

public class Facade {

		public void doVeryComplexEvilThing(String name, String code) {
			var evil = new EvilSystem();
			
			evil.doEvil();
			
			var sb = new StringBuilder();
			
			sb
				.append(evil.evilEvilHa(name))
				.append("→")
				.append(evil.evilEvilHa(code))
				.append("⇒")
				.append(evil.evilEvilHa(PersonSingleton.getUniqueInstance().toString()));
			
			System.out.println(sb.toString());
		}
}
