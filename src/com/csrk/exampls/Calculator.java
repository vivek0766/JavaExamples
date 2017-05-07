package com.csrk.exampls;

public class Calculator {
	 int a;
	 int b;
	 
	public Calculator(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int division(int x, int y) throws Exception{
		return x/y;
	}
	
	
	
}
