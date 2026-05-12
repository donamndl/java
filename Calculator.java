package com.java.Practice;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO CALCULATOR");
		System.out.println("---------------" );
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Choice: ");
		int x = sc.nextInt();
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		switch(x) {
		case 1:
			if(x == 1) {
				int res = a + b;
				System.out.println("Sum = " + res);
				break;
			}
		case 2:
			if(x == 2) {
				int res = a - b;
				System.out.println("Difference = " + res);
				break;
			}
		case 3:
			if(x == 3) {
				int res = a * b;
				System.out.println("Product = " + res);
				break;
			}
		case 4:
			if(x == 4) {
				int res = a / b;
				System.out.println("Sum = " + res);
				break;
			}
		default:
				System.out.println("Invalid Choice");
		}
		sc.close();
	}

}
