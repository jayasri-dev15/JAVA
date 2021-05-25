package com.sample;


class Student
{
	String name;
	String city;
	int age;
	
void print()
{
	System.out.println("The name is "+name);
	System.out.println("the city is "+city);
	System.out.println("The age is "+age);
}

}


public class Accessing_Object 

{
public static void main(String[] args)

{
	Student s=new Student();
	s.age=21;
	s.city="Chennai";
	s.name="Bheem";
	
	s.print();
	
	System.out.println("============================");
	
	Student s1=new Student();
	s1.age=25;
	s1.city="Bangalore";
	s1.name="Mottu";
	
	s1.print();
}

}
