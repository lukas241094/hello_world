package org.gradle;
import org.gradle.gate.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Input input = new Input();
		Output out = new Output();
		Adder add = new Adder();
		
		
		
		List<Boolean> inputs = input.getInputs();

		Boolean a = inputs.get(0);
		Boolean b = inputs.get(1);
		//String gateType = input.getGateType();
		
		
		
		
		
		
		
		List<Boolean> results = add.getResults(a,b);
		
		out.write(results);
		
		/*

		if (gateType == "AND")
			logic_and(a, b);
		if (gateType == "NOR")
			logic_nor(a, b);
		if (gateType == "NOT")
			logic_not(a, b);
		if (gateType == "NAND")
			logic_nand(a, b);
		if (gateType == "OR")
			logic_or(a, b);
		if (gateType == "XOR")
			logic_xor(a, b);
		if (gateType == "XNOR")
			logic_xnor(a, b);
*/
	}

	private static void logic_xnor(Boolean a, Boolean b) {
		XnorGate xnor = new XnorGate();
		System.out
				.println("output from XNOR gate is : " + xnor.getOutput(a, b));
	}

	private static void logic_xor(Boolean a, Boolean b) {
		XorGate xor = new XorGate();
		System.out.println("output from XOR gate is : " + xor.getOutput(a, b));
	}

	private static void logic_or(Boolean a, Boolean b) {
		OrGate or = new OrGate();
		System.out.println("output from OR gate is : " + or.getOutput(a, b));
	}

	private static void logic_nand(Boolean a, Boolean b) {
		NandGate nand = new NandGate();
		System.out
				.println("output from NAND gate is : " + nand.getOutput(a, b));
	}

	private static void logic_not(Boolean a, Boolean b) {
		NotGate not = new NotGate();
		System.out.println("output from Not gate is : " + not.getOutput(a, b));
	}

	private static void logic_nor(Boolean a, Boolean b) {
		NorGate nor = new NorGate();
		System.out.println("output from Nor gate is : " + nor.getOutput(a, b));
	}

	private static void logic_and(Boolean a, Boolean b) {
		AndGate and = new AndGate();

		System.out.println("output from AND gate is : " + and.getOutput(a, b));
	}

}
