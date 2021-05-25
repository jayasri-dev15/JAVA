
public class Fibonacci_series 

{

	public static void main(String[] args) 
	
	{
		System.out.println(fib(3));

	}
	
	/* fib(0)=0;
	 * fib(1)=1;
	 * fib(2)=fib(0)+fib(1)=0+1=1;   (n-2)+(n-1)
	 * fib(3)=fib(2)+fib(1)=1+1=2;   (n-1)+(n-2) 
	 */

	
	static int fib(int number)
	{
		if(number==0)
			return 0;
		else if(number==1)
			return 1;
		return fib(number-2)+(number-1);
	}
}
