package com.loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class While_Loop_Demo 

{

	public static void main(String[] args) 
	
	{
		Scanner scan=new Scanner(System.in);
		String again;
		/*int i=3;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
		
		 */
		do
		{
			
			int num=ThreadLocalRandom.current().nextInt(1,7);
			System.out.println("You rolled a number "+num);
			System.out.println("Again do you need a chance y/n ");
			again=scan.next();
		}while(again.equals("y"));

	}

}
