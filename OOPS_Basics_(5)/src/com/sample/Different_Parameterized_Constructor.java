package com.sample;

/*to create a class Bird also declares the different parameterized constructor to display the
name of Birds */

class Birds
{
	int age;
	String name;
	
	
Birds() 

{
	System.out.println("This is the bird");
}


Birds(String x) 

{
	this.name = x;
	System.out.println("This is the "+name);
}

Birds(int z, String y) 

{
	this.age = z;
	this.name = y;
	System.out.println("This is the "+age+"years\t"+name);
}
	


}

public class Different_Parameterized_Constructor 

{

	public static void main(String[] args) 
	
	{
		Birds a=new Birds();
		Birds b=new Birds("maina");
		Birds c=new Birds(20,"sparrow");
		
		

	}

}
