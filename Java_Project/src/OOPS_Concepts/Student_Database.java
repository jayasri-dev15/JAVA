package OOPS_Concepts;

class student_Details
{
	private static int id=1000;
	private String name;
	private String ssnn;
	private int phone;
	private String city;
	private String state;
	private String email;
	private int setAccountId;
	
    student_Details(String name, String ssnn) 
	
	{
    	id++;
		this.name = name;
		this.ssnn = ssnn;
		setEmail();
		setAccountId();
	}

    private void setAccountId()
    {
		int random=(int) Math.random();
		System.out.println(random);
		
	}

	private void setEmail()
    {
    	email=name.toLowerCase()+"."+id+"@university.com";
    	System.out.println("you email is "+email);
    	
    }
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//methods
	
	void enroll()
	{
		
	}
	void pay()
	{
		
	}
	void checkBalance()
	{
		
	}
	void showCourses()
	{
		
	}

	@Override
	public String toString() {
		return "student_Details [name=" + name + ", ssnn=" + ssnn + ", phone=" + phone + ", city=" + city + ", state="
				+ state + "]";
	}
	
	
}

public class Student_Database 

{

	public static void main(String[] args) 
	
	{
		student_Details s=new student_Details("Raju","UG");
		s.toString();

	}

}
