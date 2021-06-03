package Final_challenge_1;

public class Detective extends Person
{
	
	public static final double success_percentage=20;
	
	public Detective(String name, String nickName, int yearOfBorn, String expertIn, Item[] items) {
		super(name, nickName, yearOfBorn, expertIn, items);
		// TODO Auto-generated constructor stub
	}
	public void printBioData()
	{
		System.out.println("Detective person: ");
		super.printBioData();
	}
	

}
