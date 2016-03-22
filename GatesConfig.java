package org.gradle.gates;
import org.springframework.context.annotation.*;

@Configuration
public class GatesConfig {
	
	@Bean
	public AndGate andGate(){
		return new AndGate();
		
	}
	
	@Bean
	public OrGate orGate(){
		return new OrGate();
	}
	
	@Bean
	public XOrGate xOrGate(){
		return new XOrGate();
	}
	

}
