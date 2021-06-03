package com.sample.packages;

import java.util.Random;

public class Packages 

{

	public static void main(String[] args) 
	
	{
		int[]number=new int[1];
		
		Random generator=new Random();
		
		number[0]=generator.nextInt(10)+1;
		
		System.out.println(number[0]);

	}

}
