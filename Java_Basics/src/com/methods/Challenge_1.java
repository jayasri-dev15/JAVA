package com.methods;

import java.util.Scanner;

public class Challenge_1

{

	public static void main(String[] args) 
	
	{
		String guests[]=new String[10];
		Scanner scan=new Scanner(System.in);
		do
		{
		System.out.println("1. Display All Guests");
		System.out.println("2. Add Guests");
		System.out.println("3. Remove Guests");
		System.out.println("4. Exit");
		System.out.println("Your Option :");
		
		
		int option=scan.nextInt();
		
		if(option==1)
		{
		for(int i=0;i<guests.length;i++)
		{
			System.out.println(guests[i]);
		}
		}
		else if(option==2)
		{
			for(int i=0;i<guests.length;i++)
			{
				
			if(guests[i]==null) {
			System.out.println("Name: ");
			guests[i]=scan.next();
			break;
			}
			}
		}
		else if(option==4)
		{
			break;
		}
     }while(true);
     System.out.println("exiting......");
		
	}

}
