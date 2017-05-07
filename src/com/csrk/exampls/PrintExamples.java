package com.csrk.exampls;

public class PrintExamples {
	
	int noofLines = 5;
	
//	public void printStars(){
//		for (int i = 0; i<noofLines; i++){
//			for(int j =0; j<=i;j++){
//			System.out.print("*");
//			}System.out.println();
//		}
//	}
	
	public void printTriangle(){
		for (int a=0; a<=noofLines; a++){
			for(int b=0; b<=noofLines-a;b++){
				System.out.print(" ");
			}for (int c= 0; c<a;c++){
				System.out.print("* ");
			}System.out.println();
		}
	}

}
