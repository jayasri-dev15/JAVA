package com.sample;

class Student_details
{
	String name;
	String city;
	int age;
	

	


public Student_details(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}





void display_data()

{
	System.out.println("The name is "+name);
	System.out.println("the city is "+city);
	System.out.println("The age is "+age);
}

}


public class Accessing_Object_members 

{

	public static void main(String[] args)
	
	{
		Student_details sd=new Student_details("Bheem", "Rajasthan", 22);
		sd.display_data();
	}

}
