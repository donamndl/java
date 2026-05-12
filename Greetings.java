package com.java.Practice;
import java.util.*;

public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int btn = sc.nextInt();
		switch(btn) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Bonjour");
			break;
		default:
			System.out.println("Invalid");
		}
		sc.close();
	}

}
