package com.ojas.phani;

import java.util.Scanner;

public class FindNearestPort {

	public static void main(String[] args) {
		int row, col;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of ports:");
		int noOfPorts = sc.nextInt();
		int[][] portArray = new int[noOfPorts][noOfPorts];
		int temp[] = new int[3];
		for (int r = 0; r < noOfPorts; r++) {
			for (int c = 0; c < noOfPorts; c++) {
				System.out.println(String.format("enter distance values to portArray[%d][%d]:", r, c));
				if (r == c) {
					System.out.println(" zero only assigned for same port ");
					portArray[r][c] = 0;
				} else {
					portArray[r][c] = sc.nextInt();
				}
			}
		}
		for (row = 0; row < 3; row++) {
			int n=0;
			if (portArray[row][n] != 0) {
				temp[row] = portArray[row][0];
			} else {
				n++;
			}
			for (col = 0; col < 3; col++) {
				
			
				if (portArray[row][col] < temp[row]&& row!=col)
					temp[row] = portArray[row][col];
				
			}
			System.out.println(temp[row]);
			
		}
		for (int i = 0; i < 3; i++)
			System.out.print("\nSmallest element in " + (i + 1) + "th row is " + temp[i]);

	}

}
