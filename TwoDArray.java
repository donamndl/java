package com.java.Practice;
import java.util.*;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		// Input from user
		for(int i = 0; i < rows; i++) {        // Outer for loop controls the rows
			for(int j = 0; j < cols; j++) {       // Inner for loop controls the columns
				System.out.print("Enter the elements: ");
				arr[i][j] = sc.nextInt();         // i ---> row number & j ---> column number
			}
		}
		System.out.println();
		
		// Output
		for(int i = 0; i < rows; i++) {        // Outer for loop controls the rows
			for(int j = 0; j < cols; j++) {       // Inner for loop controls the columns
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
