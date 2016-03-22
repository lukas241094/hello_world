package org.gradle.gates;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Adder {
	
	int a;
	int b;
	int c;
	
	Adder (int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	
	ApplicationContext adder = 
			new AnnotationConfigApplicationContext(GatesConfig.class, HalfAdderConfig.class);

	
	HalfAdder ha1 = adder.getBean(HalfAdder.class);
	HalfAdder ha2 = adder.getBean(HalfAdder.class);
	OrGate og = adder.getBean(OrGate.class);
	
	public int [] evaluateAdder(){
		ha1.a = this.a;
		ha1.b = this.b;
		int [] zwischenspeicher = ha1.evaluateHalfAdder();
		ha2.a = zwischenspeicher[1];
		ha2.b = this.c;
		int [] zwischenspeicher2 = ha2.evaluateHalfAdder();
		int ogErgebnis = og.evaluate(zwischenspeicher[0], zwischenspeicher2[0]);
		
		
		int [] adderArray = {ogErgebnis,zwischenspeicher2[1]};
		return adderArray;
		
	
	}
	
	

	

}
