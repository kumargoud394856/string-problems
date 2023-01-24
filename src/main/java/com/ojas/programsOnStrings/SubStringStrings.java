package com.ojas.programsOnStrings;

public class SubStringStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kumarGoud";
		  System.out.println("All substring of "+str+" are:");
		   for(int i = 0; i < str.length(); i++) {
			String str2 = "";
			int k = i;
			for (int j = i + 1; j <= str.length(); j++) {
				
				if (j <= str.length()) {
					str2 += str.charAt(k);
					k++;
				} 
				System.out.println(str2);
				// System.out.println(str.substring(i,j));
			}
		}
	}

}
