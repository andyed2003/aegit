package org.eventb.codegen.templates.impl;

import java.util.ArrayList;
import java.util.List;

import org.eventb.codegen.templates.IGenerator;

public class InitialisationsListGenerator implements IGenerator {
	
	public List<String> generate() {
		List<String> outCode = new ArrayList<String>();
		outCode.add("// Generated By InitialisationsListGenerator ");
		return outCode;
	}
}
