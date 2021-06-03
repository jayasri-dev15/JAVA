package com.user_Input;

import java.util.Scanner;

public class Challenge_1

{

	public static void main(String[] args) 
	
	{
		int age;
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.println("Enter you name: ");
		name=scan.nextLine();
		System.out.println("Enter your age: ");
		age=scan.nextInt();
		
		System.out.println("You've lived "+age+" years.");
		System.out.println("You will be "+2*age+" years old.");
	
		
		System.out.println("The number characters in your name is "+name.length());

	}

}
