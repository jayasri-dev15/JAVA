package com.abstraction;

public abstract class Bank_Interest_Calculation 

{
	public double amount;
	
	public int years;
	public double interest_rate;
	public double interest;
	
	public static double balance=10000;
	
	//Get and set for amount,years,interest rate
	
	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getYears() {
		return years;
	}


	public void setYears(int years) {
		this.years = years;
	}


	public double getInterest_rate() {
		return interest_rate;
	}


	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}

	
	// Abstract methods
    abstract double simple_interest();
   
    
    //Non- abstract methods
    public double balance_calculation(double interest)
    {
	balance=balance-interest;
	return balance;
    }

    //Non- abstract method for reward calculation
    
    public String reward_calculation(double interest)
    {
    	if(interest>=4000)
    		return "Eligible for reward";
    	else
    		return "Try next Time";
    }
    

}
