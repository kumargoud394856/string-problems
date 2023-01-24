package com.ojas.programsOnStrings;

import java.util.Scanner;

public class StringPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string to print in star pattern... ");
		String s = scanner.next();
		int num = 0;
		int len = s.length();
		System.out.println("The star pattern is... ");
		for (int i = 1; i <= len; i++) {
			for (int j = len; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print(s.charAt(num));

			}
			num++;
			System.out.println();
		}
	}
}