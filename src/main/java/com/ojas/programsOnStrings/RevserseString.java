package com.ojas.programsOnStrings;

public class RevserseString {

	public static void main(String[] args) {
		
		String str= "kumargoud", nstr="";
        char ch;
        
      System.out.print("Original word: ");
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
	}

}
