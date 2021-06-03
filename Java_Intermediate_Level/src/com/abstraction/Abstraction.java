package com.abstraction;


class Person_A extends Bank_Interest_Calculation
{

	@Override
	double simple_interest() 
	
	{
		interest=(amount*years*interest_rate)/100.0;
		return interest;
	}
	
	
	
}


public class Abstraction 

{

	public static void main(String[] args) 
	
	{
		Person_A first=new Person_A();
		first.setAmount(50000);
		first.setInterest_rate(2);
		first.setYears(5);
		
		
		System.out.println("The total amount after calculated intrest is "+first.simple_interest()+" an the reward for this is "+first.reward_calculation(first.simple_interest())+". And the available balance is "+first.balance_calculation(first.simple_interest()));
        
	}

}
