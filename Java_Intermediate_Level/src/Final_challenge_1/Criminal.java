package Final_challenge_1;

public class Criminal extends Person
{
	
	public static final double success_percentage=20;
	
	public Criminal(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
		super(name, nickName, yearOfBorn, expertIn, items);
		// TODO Auto-generated constructor stub
	}
	public void printBioData()
	{
		System.out.println("Criminal person: ");
		super.printBioData();
	}
	

}
