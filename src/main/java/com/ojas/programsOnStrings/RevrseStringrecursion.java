package com.ojas.programsOnStrings;

public class RevrseStringrecursion {
	public String reverseString(String str)  
	{  
	//checks if the string is empty   
	if(str.isEmpty())  
	{  
	//System.out.println("String is empty.")  ;
	//if the above condition is true returns the same string      
	return str;  
	}   
	else   
	{  
	return reverseString(str.substring(1))+str.charAt(0);  
	}  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevrseStringrecursion rs = new RevrseStringrecursion();  
		String resultantSting1 = rs.reverseString("DurgaPrasad");  
		String resultantSting2 = rs.reverseString("Java");  
		String resultantSting3 = rs.reverseString("Developer");  
		System.out.println(resultantSting1);  
		System.out.println(resultantSting2);  
		System.out.println(resultantSting3);   

	}

}
