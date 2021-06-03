package com.methods;

public class Passing_Data 

{

	public static void main(String[] args) 
	
	{
		//int a_value=8;
		//int b_value=2;
		
		manipulation(8,2," metres.");

	}
	
	public static void manipulation(int a,int b,String c)
	{
		System.out.println("The result is "+(a*b+c));
	}

}
