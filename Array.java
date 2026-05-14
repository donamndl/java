package com.java.Practice;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println();
		
		// Input
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the element: ");
			num[i] = sc.nextInt();
		}
		System.out.println();
		
		//Search an element
		System.out.print("Enter element to search: ");
		int x = sc.nextInt();
		
		//Output
		for(int i = 0; i < num.length; i++) {
			if(num[i] == x) {
				System.out.print("x found at index: " + i);
			}
		}
		System.out.print("Invalid element");
		sc.close();
	}

}
