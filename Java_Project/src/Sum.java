
public class Sum 

{

	public static void main(String[] args) 
	
	{
		int num=4;
		sum(num);

	}

	static void sum(int number)
	{
		int sum=0;
		for(int i=1;i<=number;i++)
		{
		   sum=sum+i;
		}
		System.out.println("The sum is "+sum);
	}
}
