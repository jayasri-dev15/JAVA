
public class Arrays

{

	public static void main(String[] args) 
	
	{
		String cities[]= {"London","New York","Washigton","Britain","Paris"};
		
		System.out.println(cities[0]);
		System.out.println(cities[4]);
		
		
		String[] states=new String[5];
		
		System.out.println("==========================");
		
		states[0]="Tamilnadu";
		states[1]="Kerala";
		states[2]="Karnataka";
		states[3]="Bangalore";
		states[4]="Delhi";
		
		System.out.println(states[3]);
		System.out.println("==========================");
		
		//==================== For loop ==========================
		
		
		for(String i:states)     //one of the best way to approach arrays
		{
			System.out.println(i);
		}
		System.out.println("==========================");
		//=============== while loops ====================
		
		int n=0;
		while(n<=4)
		{
			System.out.println("The state at "+n+":"+states[n]);
			n++;
		}
		System.out.println("==========================");
		//============= Do while =======================
		
		int i=0;
		
		do
		{
			System.out.println("The states are "+states[i]);
			i=i+1;
		}while(i<=4);
		
		System.out.println("==========================");
		
		//================= while loop test condition first then enters loop =======================
		
		int n1=0;
		boolean stateFound=false;
		while(!stateFound)
		{
			String state=states[n1];
			System.out.println(state);
			if(state=="Tamilnadu")
				System.out.println("state Found");
			stateFound=true;
		}
		n++;
	}

}
