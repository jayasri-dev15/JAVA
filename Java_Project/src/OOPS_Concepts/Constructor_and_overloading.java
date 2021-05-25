package OOPS_Concepts;


class Banking
{
	int accountNo;
	final static int routingNo=123455; //it never be modified only after removing the final keyword it is posiible to change the value
	String name;
	String ssn;
	String accountType;
	int init_deposit;
	int balance=0;
	
	//constructors
	
	Banking()
	{
		System.out.println("New account created");
	}
	
	// constructor overloading
	
	Banking(String accountType)
	{
		System.out.println("New account type : "+accountType);
	}
	
	Banking(String accountType,int init_deposit)
	{
		System.out.println("New account type : "+accountType+" with initial deposit of $ "+init_deposit);
		String message;
		
		if(init_deposit>=2000)
			message="Thanks for your inital deposit $ "+init_deposit;
		else
			message="Minimum deposit should be $ 2000";
		System.out.println(message);
	    balance=init_deposit;
	    
	    System.out.println("New balance after initial deposit: $ "+balance);
	}
	
	//methods
	
	void deposit()
	{
		
	}
	
	void withdraw()
	{
		
	}
	
	void balance_check()
	{
		balance=balance+init_deposit;
		System.out.println("Balance after checking: $ "+balance);
	}
}

public class Constructor_and_overloading 

{

	public static void main(String[] args) 
	
	{
		Banking bank=new Banking();
		bank.accountNo=123459;
		System.out.println(bank.routingNo);
		
		
		Banking bank1=new Banking("Savings");
		bank1.accountNo=000100;
		System.out.println(bank1.routingNo);
		
		Banking bank2=new Banking("Savings",2300);
		bank2.accountNo=232344;
		bank2.balance_check();
		
	}

}
