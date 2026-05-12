package com.java.Practice;
import java.util.*;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println("Equal");
		}
		else if(a > b) {
			System.out.println("Greater");
		}
		else {
			System.out.print("Smaller");
		}
//		else {
//			if(a > b) {
//				System.out.println("Greater than b");
//			}
//			else {
//				System.out.println("Smaller than b");
//			}
//		}
		sc.close();
	}

}
