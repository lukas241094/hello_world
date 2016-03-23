package org.gradle;

import static org.junit.Assert.*;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NandGate;
import org.gradle.gate.NorGate;
import org.junit.Test;

public class NorGateTest {

	@Test
	public void testAndTT() {
		Gate gate = new NorGate();
		assertFalse(gate.getOutput(Boolean.TRUE, Boolean.TRUE));
	}

	@Test
	public void testAndTF() {
		Gate gate = new NorGate();
		assertFalse(gate.getOutput(Boolean.TRUE, Boolean.FALSE));
	}

	@Test
	public void testAndFF() {
		Gate gate = new NorGate();
		assertTrue(gate.getOutput(Boolean.FALSE, Boolean.FALSE));
	}

	@Test
	public void testNorFT() {	
		Gate gate = new NorGate();
		assertFalse(gate.getOutput(Boolean.FALSE,Boolean.TRUE));
	}
}
