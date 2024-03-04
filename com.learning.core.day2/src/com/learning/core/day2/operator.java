package com.learning.core.day2;

import java.util.Scanner;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ch = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=ch.nextInt();
		int b=ch.nextInt();
		System.out.println("\nSelect a Mathematical Operator\n");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
	    char operator = ch.next().charAt(0); 
	    
	    switch(operator)
	    {
	    case '+':
	    		System.out.println(a+b);
	    		break;
	    case '-':
	    		System.out.println(a-b);
	    		break;
	    case '*':
	    		System.out.println(a*b);
	    		break;
	    case '/':
	    		System.out.println(a/b);
	    		break;
	    }

	}
}