package com.psl.EA7;


public class sumCalculator {
	public static double sumOfFirstNOdd(int n){
		if(n>1) 
		{
			if(n%2==0){
				n--;
			}
			return n+sumOfFirstNOdd(n-2);
			
		}
		else if(n==1)
			return 1;
		else 
			throw new IllegalArgumentException();
		
		 
	}
	public static void main(String[] args) {
		
	
System.out.println("sum of first n natural numbers is:"+sumOfFirstNOdd(3));
}
}
