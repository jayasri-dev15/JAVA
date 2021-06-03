package com.conditional_statements;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge_2 

{

	public static void main(String[] args) 
	
	{
		int randomNumber = ThreadLocalRandom.current().nextInt(1,6);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("You have a chance to chose a number from 1 to 5.");
		System.out.println("Enter the number=");
		int guess=scan.nextInt();
		
		if(guess==randomNumber)
		{
			System.out.println("Correct! Aren’t you lucky.");
		}
		else
		{
			System.out.println("Wrong again! Maybe next time.");
			
		}

	}
	
}
