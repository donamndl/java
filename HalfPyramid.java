package com.java.Practice;
import java.util.*;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}
		
		// Half Pyramid with numbers
		System.out.print("Enter the value of m: ");
		int m = sc.nextInt();
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// Inverted half pyramid with numbers
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= a - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
