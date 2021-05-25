
public class Array_Operations

{

	public static void main(String[] args)
	
	{
		int[] numbers= {2,3,5,8,9};
		
		System.out.println(max(numbers));
		System.out.println(min(numbers));
		System.out.println(average(numbers));

	}
	
	static int max(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	static int min(int[]arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
	static int average(int[]arr)
	{
		int min=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum/arr.length;
	}

}
