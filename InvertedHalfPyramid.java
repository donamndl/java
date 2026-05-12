package com.java.Practice;
import java.util.*;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Inverted Half Pyramid
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		// Inverted Half Pyramid rotated by 180 degrees
		System.out.print("Enter the value of m: ");
		int m = sc.nextInt();
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= m - i; j++) {
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