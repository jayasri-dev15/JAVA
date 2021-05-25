import java.util.Scanner;

public class Array_Operation_loops 

{

	public static void main(String[] args) 
	
	{
		int[]arr=new int[4];
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the array elements: ");
		arr[0]=scan.nextInt();
		arr[1]=scan.nextInt();
		arr[2]=scan.nextInt();
		arr[3]=scan.nextInt();
		
		for(int a: arr)
		{
			System.out.println("The elements inside the array are : "+a);
		}
		
		//while loop
		
		int n=0;
		while(n<=3)
		{
			System.out.println(arr[n]);
			n++;
		}
		
		//do while loop
		
		int n1=0;
		do
		{
			System.out.println("Array traversing "+arr[n1]);
			n1=n1+1;
		}while(n1<=4);
	}

}
