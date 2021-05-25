package com.sample;


/* java to generate an abstract class A also class B inherits the class A. generate the object for
class B and display the text “call me from B” */

abstract class Abstraction
{
abstract void call();
}
class B extends Abstraction
{
public void call()
{
System.out.println("call me from B");
}
public static void main(String args[])
{
B b=new B();
b.call();
}
}