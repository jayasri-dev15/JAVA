package com.inheritance;

public class Animal

{

	public String nameOfAnimal;
	public String breedType;
	public int age;
	public String color;
	
	public Animal()
	{
		System.out.println("Animal are present here");
	}
	
	public Animal(String nameOfAnimal)
	{
		this.nameOfAnimal=nameOfAnimal;
		System.out.println("The name of the animal is "+nameOfAnimal);
	}
	
	
	public Animal(String nameOfAnimal, String breedType, int age, String color) 
	{
		super();
		this.nameOfAnimal = nameOfAnimal;
		this.breedType = breedType;
		this.age = age;
		this.color = color;
	}

	public void breed(String breedType)
	{
		System.out.println("The animal belongs to "+breedType+".");
	}
	public String age_Predict(int age)
	{
		if(age>=6)
			return "adult";
		else
			return "Kid";
	}

}
