package com.ojas.phani;

import java.util.Scanner;

class CheckPrimeNumberOrNot {
	  
    public boolean isPrime(int num)
    {
       
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
  
        return true;
    }
    public static void main(String args[])
    {
    	
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr number to check prime or not:");
        int num=sc.nextInt();
        CheckPrimeNumberOrNot prime=new CheckPrimeNumberOrNot();
       if( prime.isPrime(num)) {
    	   System.out.println("true");
       }else {
    	   System.out.println("false");
       }
    }
}