package Exceptions;

public class Arrays_Exception 

{

	public static void main(String[] args)
	
	{
		int[] number= {1,2,3,4};
		for(int i=0;i<=number.length;i++)
		try
		{
				System.out.println(number[i]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Cannor do this manipulation"+e);
		}

	}

}
