package com.sample;


class one

{
	public void display()
	{
		System.out.println("I am the first");
	}

}

class two extends one

{
	public void display_1()
	{
		System.out.println("I am the second");
	}
}


public class Single_Inheritance 

{

	public static void main(String[] args) 
	
	{
		one o=new one();
		o.display();                   // it display only one
		
		two t=new two();
		t.display_1();      
		                                // it display two message

	}

}
