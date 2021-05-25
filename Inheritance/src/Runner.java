
public class Runner 

{

	public static void main(String[] args) 
	
	{
		int levels;
		Bike b=new Bike(2, 4, 5);
		levels=b.gearUp(2);
		System.out.println("The gear range is "+levels);
		
		Bike b1=new Bike(2, 4, 5);
		levels=b.acceleratorRaise(5);
		System.out.println("The accelerator level is "+levels);

	}

}
