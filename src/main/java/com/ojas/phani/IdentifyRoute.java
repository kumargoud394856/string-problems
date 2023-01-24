package com.ojas.phani;

import java.util.Scanner;

public class IdentifyRoute {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of ports:");
		int cols = sc.nextInt();
		int rows = cols;
		int[][] port = new int[cols][rows];

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				System.out.println(String.format("enter values to port[%d][%d]", r, c));
				port[r][c] = sc.nextInt();
			}
		}
		System.out.println("enter any two port numbers to check route upto :" + cols);
		int x1 = sc.nextInt();
		int x = x1 - 1;
		int y1 = sc.nextInt();
		int y = y1 - 1;
		for (int r = 0; r < port.length; r++) {
			for (int c = 0; c < port[0].length; c++) {
				if (port[x][x] == 1 && port[x][y] == 1) {
					System.out.println("there is a route between :" + x1 + " and" + y1);
					System.exit(0);
				} else {
					System.out.println("there is no route:" + x1 + " and" + y1);
					System.exit(0);
				}

			}

		}

	}
}
