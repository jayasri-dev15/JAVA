package com.variables;

public class Variable_Demo

{

	public static void main(String[] args) 
	
	{
		int a=70;
		int b=50;
		
		System.out.println("The sum is "+(a+b));
		
		double c=4.4;
		double d=5.2;
		
		double sum=c+d;
		
		System.out.println("The addition of "+c+" and "+d+" is "+sum);
		
		//type casting
		
		int first=5;
		
		double second=first;
		
		double third=5.6;
		
		System.out.println(second+third);
		System.out.println(second);  // int id casted to double
		System.out.println(first);
		
		int a1=0;  // if a1=10; result will be 1
		int b1=10;
		
		try
		{
			int result=b1/a1;
			
				System.out.println("Positive output and the value is "+result);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error "+e);
		}


	}

}
