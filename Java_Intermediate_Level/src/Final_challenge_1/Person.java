package Final_challenge_1;

public abstract class Person 

{
public String name;
public String nickName;
public int yearOfBorn;
public String expertIn;
public Item[] items;

public String getName() {
	return name;
}
public String getNickName() {
	return nickName;
}



public Person(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
	super();
	this.name = name;
	this.nickName = nickName;
	this.yearOfBorn = yearOfBorn;
	this.expertIn = expertIn;
	this.items = items;
}

public void printBioData()
{
	System.out.println("Name : "+name+"("+nickName+")");
	System.out.println("Year of born: "+yearOfBorn);
	System.out.println("Expert in: "+expertIn);
	for(Item item:items)
	{
		System.out.println("-"+item);
	}
}

}
