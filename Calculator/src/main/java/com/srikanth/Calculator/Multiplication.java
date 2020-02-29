package com.srikanth.Calculator;

public class Multiplication {
	float firstOperand;
	float secondOperand;
	
	Multiplication(float firstOperand,float secondOperand){
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}
	
	public float multiply() {
		return this.firstOperand*this.secondOperand;
	}
}
