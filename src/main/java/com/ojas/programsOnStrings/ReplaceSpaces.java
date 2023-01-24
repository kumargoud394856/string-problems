package com.ojas.programsOnStrings;

public class ReplaceSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "Mr Durga Prasad  ";
	         
	        // Trim the given string
	        str = str.trim();
	         
	        // Replace All space (unicode is \\s) to %20
	        str = str.replaceAll("\\s", "%20");
	         
	        // Display the result
	        System.out.println(str);
	}

}
