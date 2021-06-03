package Final_challenge_1;

public class Building 

{
	public String name;
	public Item[] items;


	public Building(String name, Item[] items) {
		super();
		this.name = name;
		this.items = items;
	}

	public String getName() 

	{
		return name;
	}

	public Item[] getItems()

	{
		return items;
	}

}
