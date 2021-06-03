package com.variables;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=0;
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
