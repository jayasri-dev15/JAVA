package com.sample;

class vechicle
{
	int speed=100;
	
	void show()
	{
		System.out.println("The speed of a vechicle in general is "+speed);
	}
}

class Car extends vechicle
{
	int speed=234;
	
	void show()
	
	{
		System.out.println("The speed of a car is "+super.speed);   // I want the general speed of car
	}
}



public class Super_Keyword 

{

	public static void main(String[] args) 
	
	{
		Car c=new Car();
		c.show();
	}

}

//super keyword refers to the immediate parent class