package com.ojas.programsOnStrings;

public class SplitJava {
 public static void main(String[] args) {
	 String str = "We're Ridiculously Committed! Welcome"; 
     String[] arrOfStr = str.split(" "); 
      System.out.println("Number of substrings: "+arrOfStr.length);
      
      for(int i=0; i< arrOfStr.length; i++)
      {
          System.out.println("str["+i+"] : "+arrOfStr[i]);
      }
 }
}
