package OOPS_Concepts;


class Person
{
	String name;
	String email;
	int contact;
	
	void walk()
	{
		System.out.println(name+" is walking");
	}
	void eat()
	{
		System.out.println(email+" reach out to the mail during lunch hours");
	}
	void sleep()
	{
		System.out.println(contact+" contact me during emergency hours");
	}
}


public class Objects

{

	public static void main(String[] args)
	
	{
		// Instantiating the objects for PERSON 1
		
		Person p=new Person();
		
		//Defining some properties
		
		p.name="Sri";
		p.email="sri@gmail.com";
		p.contact=232424;
		
		//using abstraction
		
		p.walk();
		p.eat();
		p.sleep();
		System.out.println("================================");
		// Instantiating the objects for PERSON 1
		
				Person p1=new Person();
				
				//Defining some properties
				
				p1.name="Jane";
				p1.email="jane@yahoo.com";
				p1.contact=112424;
				
				//using abstraction
				
				p1.walk();
				p1.eat();
				p1.sleep();

	}

}
