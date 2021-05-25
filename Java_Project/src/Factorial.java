
public class Factorial 

{

	public static void main(String[] args) 
	
	{
		System.out.println(fact(5));

	}
	static int fact(int number)
	{

		if(number==0)
		{
			return 1;
		}
		else if(number==1)
		{
			return 1;
		}
		return fact(number-1)*number;
	}
}
