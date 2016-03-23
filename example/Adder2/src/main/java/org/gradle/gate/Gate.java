package org.gradle.gate;

public abstract class Gate {

	private Boolean a;
	private Boolean b;

	public abstract Boolean getOutput(Boolean a, Boolean b);

}
