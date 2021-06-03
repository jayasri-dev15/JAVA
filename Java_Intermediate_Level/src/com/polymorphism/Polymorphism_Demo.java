package com.polymorphism;

class A 
{
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	int add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
	
	//method overriding
	
	int add(int c)
	{
		return c;
	}
	
	
}

class B extends A
{
	int add(int a,int b)
	{
		int res=a*b;
		return res;
	}
}

public class Polymorphism_Demo

{

	public static void main(String[] args) 
	
	{
		A addition=new B();
		System.out.println(addition.add(1, 2));
		System.out.println(addition.add(2, 3, 6));
		System.out.println(addition.add(1));
		

	}

}
