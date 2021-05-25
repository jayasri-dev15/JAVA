package com.sample;

import java.util.Scanner;

public class BufferReader 

{

	public static void main(String[] args) 
	
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter your first name : ");
		String first_name=scan.nextLine();
		
		System.out.print("Enter your last name : ");
		String last_name=scan.nextLine();
		
	    System.out.println("=========== Greetings ===========");
	    System.out.println("Hello "+first_name+" "+last_name+" Welcome to the event :) ");

	}

}
