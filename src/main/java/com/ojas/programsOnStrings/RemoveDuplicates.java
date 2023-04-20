package com.ojas.programsOnStrings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println("enter input to remove duplicate more than two times repeat");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result="";
		char arr[]=str.toCharArray();
		int count;
		for(int i=0;i<str.length();i++) {
			count=2;
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					count--;
					if(count<1) {
					arr[j]='0';
					}
				}
			}
		}
		for(int i=0;i<str.length();i++) {
			if(arr[i]!='0')
				result+=arr[i];
			
		}System.out.print(result);
		
			

	}

}
