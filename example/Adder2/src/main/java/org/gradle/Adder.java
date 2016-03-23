package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.gradle.gate.AndGate;
import org.gradle.gate.Gate;
import org.gradle.gate.NorGate;
import org.gradle.gate.XnorGate;
import org.gradle.gate.XorGate;

public class Adder {

	
	/**
	 * take in two inputs, send back a list of results i.e. [0:TRUE/FALSE,1:TRUE/FALSE,2:TRUE/FALSE]
	 */


	public List<Boolean> getResults(Boolean a, Boolean b){
		
		Gate nor = new NorGate();
		Gate xor = new XorGate();
		Gate and = new AndGate();
		
		
		List<Boolean> results = new ArrayList<Boolean>();
		
		results.add(nor.getOutput(a,b));
		results.add(xor.getOutput(a,b));
		results.add(and.getOutput(a,b));

		
		System.out.println(results);
	
		
		return results;
	}


}
