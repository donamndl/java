package com.java.Practice;

import java.util.Scanner;

public class SumofOddNo {
	public static void sumFunc(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.print("Sum of odd numbers are = " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		sumFunc(n);
		sc.close();
	}

}
