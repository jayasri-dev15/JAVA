package com.inheritance;

public class Cat extends Animal

{
public String food;


public Cat(String food,String nameOfAnimal, String breedType, int age, String color) 

{
	super(nameOfAnimal,breedType,age,color);
	this.food = food;
}

public void food_for_cat(String food)
{
	System.out.println("The food for cat is "+food);
}

@Override

public void breed(String breedType)
{
	System.out.println("The cat belongs to "+breedType+".");
}

}
