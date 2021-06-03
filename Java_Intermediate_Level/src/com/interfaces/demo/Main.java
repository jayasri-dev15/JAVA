package com.interfaces.demo;


class Person_A implements Bank_Interest_Calculation
{
    public double amount;
	public int years;
	public double interest_rate;
	public double interest;
	
	@Override
	public double simple_interest() 
	{
		interest=(amount*years*interest_rate)/100.0;
		return interest;
		
	}
	
}
public class Main

{

	public static void main(String[] args) 
	
	{
		Person_A first=new Person_A();
		first.amount=50000;
		first.interest_rate=2;
		first.years=5;
		System.out.println(first.simple_interest());

	}

}
