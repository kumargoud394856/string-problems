package com.ojas.programsOnStrings;

import java.util.Scanner;

public class LengthOfStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String: ");
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    sc.close();
	    System.out.println("Length of the string is: " + length(s));
	  }

	  private static int length(String str) {
	    if (str.equals(""))
	      return 0;
	    else
	      return length(str.substring(1)) + 1;
	}

}
