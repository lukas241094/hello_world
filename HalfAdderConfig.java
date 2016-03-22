package org.gradle.gates;
import org.springframework.context.annotation.*;


@Configuration
public class HalfAdderConfig {
	
	@Bean
	public HalfAdder halfAdder(){
		return new HalfAdder();
	}
}

