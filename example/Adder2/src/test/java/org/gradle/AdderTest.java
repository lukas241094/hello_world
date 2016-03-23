package org.gradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdderTest {

	@Test
	public void testFirst() {
		
		
		Adder add = new Adder();
		
		 Boolean a = Boolean.TRUE;
		 Boolean b = Boolean.TRUE;

		/**
		 * if a =0 & b = 0 results.get(0) = 
		 */
		 
		assertFalse(add.getResults(a, b).get(0));
		assertFalse(add.getResults(a, b).get(1));
		assertTrue(add.getResults(a, b).get(2));


	}

	@Test
	public void testTF() {
		
		
		Adder add = new Adder();
		
		 Boolean a = Boolean.TRUE;
		 Boolean b = Boolean.FALSE;

		/**
		 * if a =0 & b = 0 results.get(0) = 
		 */
		 
		assertFalse(add.getResults(a, b).get(0));
		assertTrue(add.getResults(a, b).get(1));
		assertFalse(add.getResults(a, b).get(2));


	}
	
	@Test
	public void testFF() {
		
		
		Adder add = new Adder();
		
		 Boolean a = Boolean.FALSE;
		 Boolean b = Boolean.FALSE;

		/**
		 * if a =0 & b = 0 results.get(0) = 
		 */
		 
		assertTrue(add.getResults(a, b).get(0));
		assertFalse(add.getResults(a, b).get(1));
		assertFalse(add.getResults(a, b).get(2));


	}
	
	/**
	 *  [0:True/False,1:True/False,2:True/False]
	 */
	
//	[TRUE,FALSE,FALSE] when a = 0 and b = 0 
//	[FALSE,TRUE,FALSE] when a = 1 or b = 1 and the other is zero
//  [FALSE,FALSE,TRUE] when a = 1 and b = 1 
			
	
}



