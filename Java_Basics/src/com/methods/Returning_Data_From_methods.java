package com.methods;

public class Returning_Data_From_methods 

{

	public static void main(String[] args) 
	
	{
		//int value=15;
		
		int value=2;
		checking(value);
		System.out.println(Re_Checking(value));

	}
	
	public static void checking(int a)
	{
		if(a>=10)
		{
			System.out.println("The value is greater than 10");
		}
	}
	
	public static String Re_Checking(int a)
	{
		if(a<=10)
		{
			System.out.println("The value is lesser than 10");
		}
		return "The entered value is "+a;
	}

}
