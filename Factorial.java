package com.java.Practice;
import java.util.*;

public class Factorial {
	public static void printFactorial(int n) {
		if(n < 0) {
			System.out.print("Invalid Number");
			return;
		}
		
		int factorial = 1;
		for(int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		printFactorial(n);
		sc.close();
	}

}
