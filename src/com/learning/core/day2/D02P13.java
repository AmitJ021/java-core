package com.learning.core.day2;
import java.util.Scanner;


public class D02P13 {

	public static void main(String args[]){  
		Scanner ch=new Scanner(System.in);
		
		  int i,fact=1;  
		  System.out.println("Enter a number:");
		  int number=ch.nextInt();    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}

