package org.gradle;

import static org.junit.Assert.*;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NandGate;
import org.gradle.gate.NorGate;
import org.gradle.gate.NotGate;
import org.junit.Test;

public class NotGateTest {

	@Test
	public void testNotT() {
		Gate gate = new NotGate();
		assertFalse(gate.getOutput(Boolean.TRUE, null));
	}

	@Test
	public void testNotF() {
		Gate gate = new NotGate();
		assertTrue(gate.getOutput(Boolean.FALSE, null));
	}

}