package org.eventb.codegen.templates.impl;

import java.util.ArrayList;
import java.util.List;

import org.eventb.codegen.templates.AbstractGenerator;

public class InitialisationsListGenerator extends AbstractGenerator {
	private String key = "initialisationList";
	
	@Override
	public List<String> generate() {
		List<String> outCode = new ArrayList<String>();

		return outCode;
	}
	
	@Override
	public String getKey() {
		return key;
	}
	
	@Override
	public void setKey(String key) {
		super.setKey(key);
	}

}
