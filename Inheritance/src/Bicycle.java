
public class Bicycle 

{

	public int gear;
	public int speed;
	
	
	public Bicycle(int gear, int speed) 
	
	{
		super();
		this.gear = gear;
		this.speed = speed;
	}


	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
   public int gearUp(int gear1)
   {
	   gear+=gear1;
	   return gear;
   }
   
   public int gearDown(int gear2)
   {
	   gear-=gear2;
	   return gear;
   }
	
   public int speedUp(int speed1)
   {
	   speed+=speed1;
	   return speed;
   }
   
   public int speedDown(int speed2)
   {
	   speed-=speed2;
	   return speed;
   }
}
