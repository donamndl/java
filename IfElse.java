package com.java.Practice;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Not an Adult");
		}
		sc.close();
	}

}
