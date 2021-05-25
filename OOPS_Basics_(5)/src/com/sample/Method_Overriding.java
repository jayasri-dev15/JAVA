package com.sample;


class Parent

{
	void show()
	{
		System.out.println("I am the parent class");
	}
}

class child extends Parent

{
	void show()
	{
		System.out.println("I am the child class");
	}
}


public class Method_Overriding 

{

	public static void main(String[] args) 
	
	{
		Parent p=new Parent();
		p.show();
		
		System.out.println("==============================");
		
		Parent c=new child();      //is a runtime polymorphism
		c.show();

	}

}
