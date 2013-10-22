package org.eventb.codegen.templates;


public abstract class AbstractGenerator implements IGenerator {
	// The concrete class must initialise the key.
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	} 
}
