package com.methods;

public class Methods_Demo 

{

	public static void main(String[] args) 
	
	{
		//veg_animals();
		//non_veg_animals();
		prey_for_non_veg();
		master_animals();
	}
	
	public static void veg_animals()
	{
		System.out.println("Deer is a veg animal");
		System.out.println("Cow is a veg animal");
	}
	
	public static void non_veg_animals()
	{
		System.out.println("Tiger is a non veg animal");
		System.out.println("Lion is a non veg animal");
	}
	
	public static void prey_for_non_veg()
	{
		veg_animals();
	}
	
	public static void master_animals()
	{
		non_veg_animals();
	}

}
