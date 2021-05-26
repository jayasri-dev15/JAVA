package Exceptions;

public class Adding 

{

	public static void main(String[] args) 
	
	{
		int a=0;
		int b=-1;
		
		try
		{
			add(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot do this manipulation "+e);
		}

	}
	
	public static void add(int n1,int n2)
	{
		int result=n2/n1;
		System.out.println("The result is "+result);
	}

}
