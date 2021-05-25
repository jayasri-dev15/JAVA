
public class Bike extends Bicycle

{
	int accelerator;
	
public Bike(int gear, int speed, int accelerator) 

{
		super(gear, speed);
		this.accelerator = accelerator;
}

public int acceleratorRaise(int acc1)
{
	acc1+=speed;
	return acc1;
}

public int acceleratorDown(int acc2)
{
	acc2-=speed;
	return acc2;
}



}
