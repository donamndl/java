package com.java.Practice;
import java.util.*;

public class SpiralOrderMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int m = sc.nextInt();
		
		int[][] array = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print("Enter your elements: ");
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The Spiral Order Matrix is: ");
		
		int rowStart = 0;
		int rowEnd = n - 1;
		int colStart = 0;
		int colEnd = m - 1;
		
		while(rowStart <= rowEnd && colStart <= colEnd) {
			for(int col = colStart; col <= colEnd; col++) {
				System.out.print(array[rowStart][col] + " ");
			}
			rowStart++;
			for(int row = rowStart; row <= rowEnd; row++) {
				System.out.print(array[row][colEnd] + " ");
			}
			colEnd--;
			for(int col = colEnd; col >= colStart; col--) {
				System.out.print(array[rowEnd][col] + " ");
			}
			rowEnd--;
			for(int row = rowEnd; row >= rowStart; row--) {
				System.out.print(array[row][colStart] + " ");
			}
			colStart++;
		}
		System.out.println();
		sc.close();
	}

}
