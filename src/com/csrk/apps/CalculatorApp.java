package com.csrk.apps;

import com.csrk.exampls.Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(5,5);
		System.out.println("please give correct input-->"+calculator);
		
		try {
			calculator.division(6, 0);
		} catch (Exception e) {
			System.out.println("pls give correct input");
			//e.printStackTrace();
		}
	}
	
	
}

