package org.gradle.gates;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HalfAdder {
	//Variables of the HalfAdder
	public int a;
	public int b;
	
	// HalfAdder Constructor
	/*
	HalfAdder(int a, int b){
		this.a=a;
		this.b=b;
	}*/
	HalfAdder(){	
	}
	
	
	//Requirements for the use of Springbeans
	ApplicationContext halfAdder = 
			new AnnotationConfigApplicationContext(GatesConfig.class);
	
	//Using Spring Beans to create the used gates
	AndGate andGate = halfAdder.getBean(AndGate.class);
	XOrGate xOrGate = halfAdder.getBean(XOrGate.class);
	
    //Saving result of the HalfAdder
	
	public int [] evaluateHalfAdder(){
	
	int c = andGate.evaluate(a, b);
	int d = xOrGate.evaluate(a, b);
	int [] halfAdderArray = {c,d};
	return halfAdderArray;
	}

}
