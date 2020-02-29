package com.srikanth.Calculator;

public class Addition {
	float firstOperand;
	float secondOperand;
	
	Addition(float firstOperand,float secondOperand){
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}
	
	public float add() {
		return this.firstOperand+this.secondOperand;
	}
}
