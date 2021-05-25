package com.sample;


class First_level

{
	public void display()
	{
		System.out.println("I am the first");
	}

}

class Second_Level extends First_level

{
	public void display_1()
	{
		System.out.println("I am the second");
	}
}

class Third_Level extends Second_Level
{
	public void display_2()
	{
		System.out.println("I am the third");
	}
}


public class Multilevel_Inheritance 

{

	public static void main(String[] args) 
	
	{
		Third_Level r=new Third_Level();
		r.display_2();
		r.display_1();
		r.display();

	}

}
