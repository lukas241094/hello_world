package org.gradle;

import static org.junit.Assert.*;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NandGate;
import org.gradle.gate.NorGate;
import org.gradle.gate.NotGate;
import org.gradle.gate.XnorGate;
import org.gradle.gate.XorGate;
import org.junit.Test;

public class XorGateTest {
	@Test
	public void testXorTT() {
		Gate gate = new XorGate();
		assertFalse(gate.getOutput(Boolean.TRUE, Boolean.TRUE));
	}

	@Test
	public void testXorTF() {
		Gate gate = new XorGate();
		assertTrue(gate.getOutput(Boolean.TRUE, Boolean.FALSE));
	}

	@Test
	public void testXorFF() {
		Gate gate = new XorGate();
		assertFalse(gate.getOutput(Boolean.FALSE, Boolean.FALSE));
	}

	@Test
	public void testXorFT() {	
		Gate gate = new XorGate();
		assertTrue(gate.getOutput(Boolean.FALSE,Boolean.TRUE));
	}
}