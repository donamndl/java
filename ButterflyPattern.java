package com.java.Practice;
import java.util.*;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		// Outer for loop for the upper half pattern
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) { // Inner for loop to print the first part of the upper half pattern
				System.out.print("* ");
			}
			for(int j = 1; j <= 2 * (n - i); j++) {  // Inner for loop to print the spaces in between the upper half of pattern
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {  // Inner for loop to print the last part of the upper half of the pattern
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Outer for loop for the lower half pattern
		for(int i = n; i >= 1; i--) { 
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j <= 2 * (n - i); j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
