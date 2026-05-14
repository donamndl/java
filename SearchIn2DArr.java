package com.java.Practice;
import java.util.*;

public class SearchIn2DArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		int[][] nums = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print("Enter the element: ");
				nums[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		System.out.print("Enter the element to search: ");
		int x = sc.nextInt();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(nums[i][j] == x) {
					System.out.print("Element found at index: (" + i + ", " + j + ")");
				}
			}
		}
		sc.close();
	}
}
