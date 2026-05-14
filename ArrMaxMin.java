package com.java.Practice;
import java.util.*;

public class ArrMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] nums = new int[size]; 
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the number: ");
			nums[i] = sc.nextInt();
		}
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Minimum number is: " + min);
		System.out.print("Maximum number is: " + max);
		sc.close();
	}
}
