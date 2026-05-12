package com.java.Practice;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum = " + sum);
		sc.close();
	}

}
