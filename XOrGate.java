package org.gradle.gates;

public class XOrGate implements Gates {
	
	
	public int evaluate(int a,int b){
		//This could be shortened to be
		// return (a==1 ^ b==1)? 1:0;
		int c=(a==1 ^ b==1)? 1:0;
		return c;
	}

}
