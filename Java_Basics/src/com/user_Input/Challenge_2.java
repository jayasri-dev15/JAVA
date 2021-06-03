package com.user_Input;

import java.util.Scanner;

public class Challenge_2

{

	public static void main(String[] args) 
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total bill amount = ");
		double bill_total=scan.nextDouble();
		System.out.println("Enter the number of persons had the dinner : ");
		double number_of_people=scan.nextDouble();
		
		double each_to_be_pay=bill_total/number_of_people;
		
		System.out.println("The each has to pay $ "+each_to_be_pay);

	}

}
