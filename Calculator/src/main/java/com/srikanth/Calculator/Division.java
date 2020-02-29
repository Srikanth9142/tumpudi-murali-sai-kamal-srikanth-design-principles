package com.srikanth.Calculator;

public class Division {
	float firstOperand;
	float secondOperand;
	
	Division(float firstOperand,float secondOperand){
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}
	
	public float divide() {
		return (this.firstOperand/this.secondOperand);
	}
}
