package com.learning.core.day2;
import java.util.Scanner ;

public class D02P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch = new Scanner(System.in);

	    System.out.println("Enter three numbers: ");
	    int num1 = ch.nextInt();
	    int num2 = ch.nextInt();
	    int num3 = ch.nextInt();

	    int max = num1; 

	    if (num2 > max) {
	      max = num2;
	    }

	    if (num3 > max) {
	      max = num3;
	    }

	    System.out.println("Maximum number: " + max);
	}

}
