package org.gradle.gate;

public class NotGate extends Gate {

	@Override
	public Boolean getOutput(Boolean a, Boolean b) {
		return a ? false : true;
	}

}
