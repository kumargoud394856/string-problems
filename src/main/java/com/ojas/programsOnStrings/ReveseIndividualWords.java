package com.ojas.programsOnStrings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReveseIndividualWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 Approach
		
		String str = "Welcome to prasad";
        
        // Splitting the string based on space and reverse each part
        // and then join
        String result = Arrays.asList(str.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
 
        System.out.println(result);
	}

}
