package com.conditional_statements;

import java.util.Scanner;

public class Else_if_Demo 

{

	public static void main(String[] args)
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you weight: ");
		int weight=scan.nextInt();
		
		if(weight<=20)
		{
			System.out.println("Have a rich protein based food");
		}
		
		else if(weight>21 && weight <=50)
		{
			System.out.println("Maintain your weight");
		}
		
		else if(weight>51 && weight <=75)
		{
			System.out.println("Over weight. Have a Exercise");
		}
		else
		{
			System.out.println("Consult a Doctor");
		}
	}

}
