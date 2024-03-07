package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		System.out.println("Length of the string:"+str.length());
		System.out.println("String in uppercase:"+str.toUpperCase());
		
		boolean flag = true;    
        
        String string = str.toLowerCase();    
            
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}