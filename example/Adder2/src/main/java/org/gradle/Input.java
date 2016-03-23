package org.gradle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.gradle.gate.*;

public class Input {

	private List<Boolean> inputs;
	String gateType = null;
	
	

	public List<Boolean> getInputs() {
		getBinaryNumbers();
		getLogicGateType();
		return inputs;
	}

	private void getBinaryNumbers() {

		System.out.println("Please give in two binary string inputs");

		inputs = new ArrayList<Boolean>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String choices = null;

		try {
			choices = br.readLine();
			System.out.println(choices);
			setChoices(choices);
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your binary string!");
			System.exit(1);
		}

		return;
	}

	/**
	 * A method to print out available choices of gates
	 */
	private void getLogicGateType() {
		System.out.println("What type of gate would you like?");
		System.out.println(" Choices are:");

		for (GateType gate : GateType.values()) {
			System.out.println(gate);
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		try {
			gateType = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your gate choice!");
			System.exit(1);
		}

		System.out.println("Your gate choice was:" + gateType);

		return;
	}

	private void setChoices(String choices) {

		/**
		 * Split line into seperate objects.
		 */
		inputs.add(Boolean.FALSE);
		inputs.add(Boolean.FALSE);
		System.out.println(inputs);
		
		String one = "0";
		
		List<String> numbers= Arrays.asList(choices.split("\\W+"));
		 
		Integer a = Integer.valueOf(numbers.get(0));
		Integer b = Integer.valueOf(numbers.get(1));

		System.out.println("Choices:" + numbers);
		System.out.println("Option 1 was:" + numbers.get(0) + " Option two was:" + numbers.get(1) +":");
		if(a == 1 ){
			System.out.println("Switched to true");
			inputs.set(0,Boolean.TRUE);
		}
		if(b == 1) inputs.set(1,Boolean.TRUE);

		System.out.println("Your binary is:" + inputs.get(0) +" and " + inputs.get(1));

	}
	
	public String getGateType() {
		return gateType;
	}

	public void setGateType(String gateType) {
		this.gateType = gateType;
	}

}
