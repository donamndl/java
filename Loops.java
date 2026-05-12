package com.java.Practice;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		int j = 12;
		while(j < 11) {  // here first the condition is checked and since the value is 12 so the condition becomes false and we dont get any output
			System.out.print("Hello");
		}
		System.out.println(" ");
		int k = 12;
		do {  // here first the output is printed at least once and then condition is checked so here since the value is 12 so the output is printed only once and then the condition is checked where it becomes false
			System.out.print("Hello");
		}while(k < 11);
	}

}
