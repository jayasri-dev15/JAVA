package Exceptions;

import java.util.Scanner;

public class Amount_Exception 

{

	public static void main(String[] args) throws negative_Exception 
	
	{
		System.out.println("Enter the amount: ");
		Scanner scan=new Scanner(System.in);
		
		try
		{
			double amount=scan.nextDouble();
			if(amount<0)
				throw new negative_Exception();
			
		}catch(ArithmeticException e)
		{
			System.out.println("Error");
		}

	}

}
