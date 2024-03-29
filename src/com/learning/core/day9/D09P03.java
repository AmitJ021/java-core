package com.learning.core.day9;
import java.util.Scanner;

public class D09P03 
{

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	            System.out.println("Enter the size of array: ");
	            int size = scanner.nextInt();
	            int[] array = new int[size];
	            System.out.println("Enter the elements of array: ");
	            for (int j = 0; j < size; j++) 
	            {
	                array[j] = scanner.nextInt();
	            }
	            System.out.println("Enter the element to search:");
	            int target = scanner.nextInt();
	            if (linearSearch(array, target)) 
	            {
	                System.out.println("Element is Present");
	            } 
	            else 
	            {
	                System.out.println("Element is Not Present");
	            }
	    }

	    public static boolean linearSearch(int[] arr, int target) 
	    {
	        for (int i = 0; i < arr.length; i++) 
	        {
	            if (arr[i] == target) 
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	}
	