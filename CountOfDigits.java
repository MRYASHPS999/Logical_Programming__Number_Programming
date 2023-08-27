package com.jsp.number_programming;

public class CountOfDigits {
	
	public static int countOfDigitsInNumber(int n) {
		int count=0;
		
		while(n>0) {
			n=n/10;
			count++;
			
			
		}return count;
		
	}

	public static void main(String[] args) {
		System.out.println(countOfDigitsInNumber(456789));
	}

}


OUTPUT:
6