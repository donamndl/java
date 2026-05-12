package com.java.Practice;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		sc.close();
	}

}
