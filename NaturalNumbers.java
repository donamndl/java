package com.java.Practice;
import java.util.*;

public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
//		int sum = 0;
//		for(int i = 0; i <= n; i++) {
//			sum = sum + i;
//		}
//		System.out.print(sum + " ");

//		for(int i = 1; i < 11; i++) {
//			int res = n * i;
//			System.out.print(res + " ");
//		}
		
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();	
	}
}
