package com.learning.core.day2;
import java.util.Scanner;

public class even {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ch= new Scanner(System.in);
		
		 System.out.println("Enter a number: ");
		    int num = ch.nextInt();

		    int i = 0;
		    while (i <= num) {
		      if (i % 2 == 0) {
		        System.out.println(i);
		      }
		      i++;

	}
	}
}
