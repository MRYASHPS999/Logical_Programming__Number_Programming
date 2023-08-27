package com.jsp.number_programming;
import java.util.Scanner;

public class FactorsOfNum {
	
	public static void factorsOfNum(int n) {
		
		for(int i=1;i<=n;i++ ) {
			if(n%i==0) {
				System.out.println("factors are: " + i +" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" Enter a number : ");
		
		int num1=sc.nextInt();
		
		sc.close();
		
		factorsOfNum(num1);
		
		
		

	}

}


OUTPUT: 

Enter a number : 
58
factors are: 1 
factors are: 2 
factors are: 29 
factors are: 58 
