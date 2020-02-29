package com.srikanth.Calculator;

import java.util.*;
import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first operand: ");
        float a = sc.nextFloat();
        System.out.println("Enter the second operand: ");
        float b = sc.nextFloat();
        System.out.println("Enter operation symbol: ");
        String ch = sc.next();
        switch(ch) {
        	case "+":
        		Addition addObj = new Addition(a,b);
        		System.out.println(addObj.add());
        		break;
        	case "-":
        		Subtraction subObj = new Subtraction(a,b);
        		System.out.println(subObj.subtract());
        		break;
        	case "/":
        		Division divObj = new Division(a,b);
        		System.out.println(divObj.divide());
        		break;
        	case "*":
        		Multiplication mulObj = new Multiplication(a,b);
        		System.out.println(mulObj.multiply());
        		break;
        	default: 
        		System.out.println("No operation available in calculator");
        }
        
    }
}
