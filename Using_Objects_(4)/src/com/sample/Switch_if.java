package com.sample;

import java.util.Scanner;

public class Switch_if 

{

	public static void main(String[] args) 
	
	
	{
		int number;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your choice from below .... ");
		System.out.print("Choice available are 1 and 2 : ");
		
		number=scan.nextInt();
		
		if(number==1)
		{
			System.out.println("Go to Horror show");
			
			switch(number)
			{
			case 1:
				System.out.println("Free for kids");
			default:
				System.out.println("Age should me greater than 7");
			break;
			}
		}
		else
		{
			System.out.println("Go to study");
		}

	}

}
