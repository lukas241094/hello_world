package com.wwu.gates
import org.gradle.gates.*
import spock.lang.*

class RealGateTest extends Specification{
	def "Test Method And Gate"(){ 
		
		expect:
		
		def gate = new AndGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 1
		1 | 0 | 0
		0 | 1 | 0
		0 | 0 | 0	
	}
	
	def "Test Method Or Gate"(){
		
		expect:
		
		def gate = new OrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 1
		1 | 0 | 1
		0 | 1 | 1
		0 | 0 | 0
		
	}
	
	def "Test Method Not Gate"(){
		expect:
		def gate = new NotGate()
		
		gate.evaluate(a,b)==c
		
		where:
		
		a | b | c
		1 | 1 | 0
		0 | 1 | 1
		0 | 1 | 1
	}
	
	def "Test Method NOr Gate"(){
		expect:
		def gate = new NOrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 0
		1 | 0 | 0
		0 | 1 | 0
		0 | 0 | 1
		
	}
	
	def "Test Method XOr Gate"(){
		expect:
		def gate = new XOrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 0
		1 | 0 | 1
		0 | 1 | 1
		0 | 0 | 0
		
	}
	
	def "Test Method NAnd Gate"(){
		expect:
		def gate = new NAndGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 0
		1 | 0 | 1
		0 | 1 | 1
		0 | 0 | 1
		
	}
	
	def "Test Method XNOr Gate"(){
		expect:
		def gate = new XNOrGate()
		
		gate.evaluate(a,b)==c
		
		where:
		a | b | c
		1 | 1 | 1
		1 | 0 | 0
		0 | 1 | 0
		0 | 0 | 1
		
	}

}
