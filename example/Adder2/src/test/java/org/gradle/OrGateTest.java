package org.gradle;

import static org.junit.Assert.*;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NandGate;
import org.gradle.gate.NorGate;
import org.gradle.gate.NotGate;
import org.gradle.gate.OrGate;
import org.gradle.gate.XnorGate;
import org.gradle.gate.XorGate;
import org.junit.Test;

public class OrGateTest {
	@Test
	public void testOrTT() {
		Gate gate = new OrGate();
		assertTrue(gate.getOutput(Boolean.TRUE, Boolean.TRUE));
	}

	@Test
	public void testOrTF() {
		Gate gate = new OrGate();
		assertTrue(gate.getOutput(Boolean.TRUE, Boolean.FALSE));
	}

	@Test
	public void testOrFF() {
		Gate gate = new OrGate();
		assertFalse(gate.getOutput(Boolean.FALSE, Boolean.FALSE));
	}

	@Test
	public void testOrFT() {	
		Gate gate = new OrGate();
		assertTrue(gate.getOutput(Boolean.FALSE,Boolean.TRUE));
	}
}