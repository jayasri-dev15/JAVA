
public class Functions_Types

{

	public static void main(String[] args) 
	
	{
		int num1=30;
		int num2=10;
		String name="Sri";
		
		Divide(num1,num2);
		
		System.out.println("your name is "+print_Name(name));
		
		System.out.println("Sum is "+add_Numbers(num1, num2));
		
		System.out.println("Product is "+Product_Numbers(num1, num2));

	}
	
	static String print_Name(String name)
	{
		return name;
	}
	
	static int add_Numbers(int num1,int num2)
    {
    	int result=num1+num2;
    	return result;
    }
    
	static int Product_Numbers(int num1,int num2)
    {
    	int result=num1*num2;
    	return result;
    }
    
	static void Divide(int a,int b)
	{
		int res=a/b;
		System.out.println("The quotient is "+res);
	}
    

}
