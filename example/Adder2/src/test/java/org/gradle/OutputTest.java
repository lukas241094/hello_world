package org.gradle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OutputTest {

	@Test
	public void testFirstResult() {
		
		Output out = new Output();
		List<String> results = new ArrayList<String>();
		
		results.add("True");
		results.add("False");
		results.add("False");

		assertEquals(results.get(1), "False");
		
	}
	
	
}
