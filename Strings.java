package com.java.Practice;
import java.util.*;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String name = sc.nextLine();
		System.out.println("Your entered string is: " + name);
		
		System.out.println("-----------------");
		
		//concatenation
		String firstName = "Tony";
		String lastName = "Stark";
		String fullName = firstName + " " + lastName;
		String full = firstName + "@" + lastName;
		System.out.println(fullName);
		System.out.println(full);
		
		System.out.println("-----------------"); 
		
		// length function
		String m = "Myself@";
		System.out.println(m.length());        // counts and returns the length of the string
		
		System.out.println("-----------------");
		
		// charAt() function prints each character of the string
		String ch = "Tony@Stark";
		for(int i = 0; i < ch.length(); i++) {
			// System.out.print(ch.charAt(i) + " ");  // Prints each character in one line in a sequence
			System.out.println(ch.charAt(i));     // Prints each character in new line
		}
		
		// compareTo() functions compares two strings --- if(s1 > s2) ---> it will print any +ve value; if(s1 == s2) ---> prints 0; if(s1 < s2) ---> prints any -ve value
		// Comparison is done like this: if the first is A and second string is B then A is considered smaller than B. If the first character would be same then the next character will be checked in the same manner.
		String str1 = "Alice";
		String str2 = "Alice";
		if(str1.compareTo(str2) == 0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		System.out.println("-----------------");
		
		// This is not used in case of characters because in many cases it fails too give the correct output so compareTo() function was introduced.
		if(str1 == str2) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		System.out.println("-----------------");
		
		// Here we should have got the output as equal but it was not so hence compareTo() function is used
		if(new String("Alice") == new String("Alice")) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		System.out.println("-----------------");
		
		// substring() function is used to take out a part of a bigger string.
		// stringName.substring(beginning index, ending index) ---> ending index will be excluded and the result will be returned till (ending index - 1).
		String sen = "My name is David Kaushik.";
		String sub = sen.substring(11, sen.length());
		System.out.print(sub);
		sc.close();
	}
}
