package com.loops;

/*
 * Write a program which prints numbers from 1 to 40. After every third number, print �Quack.�.


 */
public class Challenge_2 

{

	public static void main(String[] args)
	
	{
		int count = 1;
		 
		for (int i = 1; i <= 40; i++) 
		
		{
		 
		    System.out.println(i);
		 
		    if (count == 3) 
		    {
		        System.out.println("Quack.");
		        count = 0;
		    }
		 
		    count++;
		    
		}
	}

}
