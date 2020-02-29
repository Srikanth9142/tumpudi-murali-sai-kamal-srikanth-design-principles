package com.srikanth.Calculator;

public class Subtraction {
	float firstOperand;
	float secondOperand;
	
	Subtraction(float firstOperand,float secondOperand){
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}
	
	public float subtract() {
		return this.firstOperand-this.secondOperand;
	}
}
