package com.java.Practice;
import java.util.*;

public class SortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the element: ");
			arr[i] = sc.nextInt();
		}
		
		boolean isAscending = true;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				isAscending = false;
			}
		}
		
		if(isAscending) {
			System.out.print("The array is sorted in ascending order");
		}
		else {
			System.out.print("The array is not sorted in ascending order");
		}
		sc.close();
	}

}
