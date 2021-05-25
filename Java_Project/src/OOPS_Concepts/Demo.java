package OOPS_Concepts;

import java.util.Scanner;

public class Demo

{

	public static void main(String[] args) 
	
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the total count: ");
		int number=scan.nextInt();
		
		
		for(int i=1;i<=number;i++)
		{
			System.out.println("Name: ");
			String name=scan.next();
			System.out.println("Email: ");
			String email=scan.next();
			System.out.println("Number is:");
			int contact=scan.nextInt();
			
			details_template(name, email, contact);
		}

	}
	
	static void details_template(String person_name,String person_email,int contact)
	{
		System.out.println("Your name is "+person_name);
		System.out.println("Your email is "+person_email);
		System.out.println("Your contact is "+contact);
	}

}
