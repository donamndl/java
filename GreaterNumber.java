package com.java.Practice;

import java.util.Scanner;

public class GreaterNumber {
	public static int getGreater(int a , int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		System.out.print("Greater Number = " + getGreater(a, b));
		sc.close();
	}

}
