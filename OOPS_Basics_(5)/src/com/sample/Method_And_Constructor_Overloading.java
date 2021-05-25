package com.sample;

class Calculation

{
	
int number_1,number_2;

public Calculation()               // default constructor

{
	
}

public Calculation(int numbers_1, int numbers_2)  // parameterized constructor

{
	
	this.number_1 = numbers_1;
	this.number_2 = numbers_2;
}

public int addition(int number_1,int number_2)   // method overloading
{
	return number_1+number_2;
}

public int addition_1(int number_1,int number_2,int number_3)
{
	return number_1+number_2+number_3;
}
}


public class Method_And_Constructor_Overloading 

{

	public static void main(String[] args) 
	
	{
		Calculation c=new Calculation();
		
		c.number_1=23;
		c.number_2=10;
		System.out.println(+c.addition_1(23, 10, 23));
		System.out.println("The addition is "+c.addition(10, 20));
		
	}

}
