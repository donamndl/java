package com.java.Practice;
import java.util.*;

public class Average {
	public static void AvgFunc(double a, double b, double c) {
		double avg = (a + b + c) / 3;
		System.out.print("Average of the numbers = " + avg);
		return;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		System.out.print("Enter the third number: ");
		int c = sc.nextInt();
		
		AvgFunc(a, b, c);
		sc.close();
	}

}
