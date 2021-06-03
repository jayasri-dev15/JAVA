package Encapsulation;


class Property
{
	private String nameOfThing;
	private int price;
	private final static int production_year=2021;
	
	
	//Get and set are both read and write only
	public String getNameOfThing() {
		return nameOfThing;
	}
	public void setNameOfThing(String nameOfThing) {
		this.nameOfThing = nameOfThing;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//For production year I am using Get method alone
	
	public int getProduction_year() {
		return production_year;
	}

	//method creation
	public String rating(int price)
	{
		if(price>=20000)
			return "Good";
		else
		    return "Bad";
		
	}
	
}

public class Encapsulation_Demo 

{

	public static void main(String[] args) 
	
	{
		Property Bike=new Property();
		Bike.setNameOfThing("Bike");
		Bike.setPrice(29000);
		
		
		System.out.println(Bike.getNameOfThing());
		System.out.println(Bike.getPrice());
		System.out.println(Bike.getProduction_year());
		System.out.println(Bike.rating(Bike.getPrice()));
	}

}
