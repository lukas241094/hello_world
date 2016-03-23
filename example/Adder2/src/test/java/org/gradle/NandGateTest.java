package org.gradle;

import static org.junit.Assert.*;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NandGate;
import org.junit.Test;

public class NandGateTest {
	
	@Test
	public void testNandTT() {
		Gate gate = new NandGate();
		assertFalse(gate.getOutput(Boolean.TRUE, Boolean.TRUE));
	}

	@Test
	public void testNandTF() {
		Gate gate = new NandGate();
		assertTrue(gate.getOutput(Boolean.TRUE, Boolean.FALSE));
	}

	@Test
	public void testNandFF() {
		Gate gate = new NandGate();
		assertTrue(gate.getOutput(Boolean.FALSE, Boolean.FALSE));
	}

	@Test
	public void testNandFT() {	
		Gate gate = new NandGate();
		assertTrue(gate.getOutput(Boolean.FALSE,Boolean.TRUE));
	}


}
