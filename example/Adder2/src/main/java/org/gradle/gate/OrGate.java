package org.gradle.gate;


public class OrGate extends Gate {
	
	@Override	
	public Boolean getOutput(Boolean a, Boolean b){
		return ( a  ||  b)?  true:false;						
	}
}
