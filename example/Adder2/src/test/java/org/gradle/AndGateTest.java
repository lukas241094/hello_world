package org.gradle;

import static org.junit.Assert.*;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NandGate;
import org.junit.Test;

public class AndGateTest {

	@Test
	public void testAndTT() {
		Gate gate = new AndGate();
		assertTrue(gate.getOutput(Boolean.TRUE, Boolean.TRUE));
	}

	@Test
	public void testAndTF() {
		Gate gate = new AndGate();
		assertFalse(gate.getOutput(Boolean.TRUE, Boolean.FALSE));
	}

	@Test
	public void testAndFF() {
		Gate gate = new AndGate();
		assertFalse(gate.getOutput(Boolean.FALSE, Boolean.FALSE));
	}

	@Test
	public void testAndFT() {	
		Gate gate = new AndGate();
		assertFalse(gate.getOutput(Boolean.FALSE,Boolean.TRUE));
	}
}
