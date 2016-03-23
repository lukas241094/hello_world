package org.gradle;

import static org.junit.Assert.*;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NandGate;
import org.gradle.gate.NorGate;
import org.gradle.gate.NotGate;
import org.gradle.gate.XnorGate;
import org.junit.Test;

public class XnorGateTest {

	@Test
	public void testXnorTT() {
		Gate gate = new XnorGate();
		assertTrue(gate.getOutput(Boolean.TRUE, Boolean.TRUE));
	}

	@Test
	public void testXnorTF() {
		Gate gate = new XnorGate();
		assertFalse(gate.getOutput(Boolean.TRUE, Boolean.FALSE));
	}

	@Test
	public void testXnorFF() {
		Gate gate = new XnorGate();
		assertTrue(gate.getOutput(Boolean.FALSE, Boolean.FALSE));
	}

	@Test
	public void testXnorFT() {	
		Gate gate = new XnorGate();
		assertFalse(gate.getOutput(Boolean.FALSE,Boolean.TRUE));
	}

}