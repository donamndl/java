package com.java.Practice;
import java.util.*;

public class RectPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int m = sc.nextInt();
		System.out.print("Enter another number: ");
		int n = sc.nextInt();
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
		System.out.println(" ");
		}
		sc.close();
	}

}
