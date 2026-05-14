package com.java.Practice;
import java.util.*;

public class NamesArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		String[] name = new String[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter the name: ");
			name[i] = sc.next();
		}
		System.out.println();
		
		for(int i = 0; i < name.length; i++) {
			System.out.print("Name " + (i + 1) + " is: " + name[i] + " ");
		}
		sc.close();
	}

}
