package com.conditional_statements;

import java.util.Scanner;

public class Challenge_1 

{

	public static void main(String[] args) 
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number=");
		int first=scan.nextInt();
		System.out.println("Enter the second number=");
		int second=scan.nextInt();
		
		if(first>second)
		{
			System.out.println("x is bigger than y and difference between x and y is "+(first-second));  // first > second
		}
		else if(first<second)
		{
			System.out.println("x is smaller than y and difference between x and y is "+(second-first)); //first < second
		}
		else if(first==second)
		{
			System.out.println("x and y are the same and difference between x and y is "+(first-second));
		}
	}

}
