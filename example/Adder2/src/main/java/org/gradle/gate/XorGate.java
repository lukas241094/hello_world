package org.gradle.gate;


public class XorGate extends Gate {

		
	@Override	
	public Boolean getOutput(Boolean a, Boolean b){
		return a == b ? false : true;	
	}
}

