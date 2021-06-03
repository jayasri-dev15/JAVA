package com.conditional_statements;

import java.util.Scanner;

public class Else_if_Demo_2 

{

	public static void main(String[] args)
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age=scan.nextInt();
		System.out.println("Do you have a VIP Pass yes/no: ");
		String pass=scan.next();
		
		if(age>=18 && pass.equals("yes"))
		{
			System.out.println("You can Go inside -> ");
		}
		else
		{
			System.out.println("No Entry");
		}

	}

}
