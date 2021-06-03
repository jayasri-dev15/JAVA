package com.objects;

import com.inheritance.Animal;
import com.inheritance.Cat;

public class Class_And_Objects 

{
	public static void main(String[] args) 
	
	{
		Animal cat=new Cat("Milk", "cat", "Russian breed", 1, "white");
		System.out.println(cat.age_Predict(cat.age));
		System.out.println(cat.breedType);
		
		//=========================
		
		Animal super_class=new Animal("Parent","Pomerian",8,"White");
		System.out.println(super_class.age_Predict(super_class.age));
		
		Cat cat1=new Cat("Rice", "Cat1", "Europe breed", 7, "Brown");
		cat1.food_for_cat(cat1.food);

	}

}
