package com.java.Practice;
import java.util.*;

public class HollowRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++) {
				if(i == 1 || i == a || j == 1 || j == b) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
