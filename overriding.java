/*This Java program demonstrates the concept of method overriding in object-oriented programming. It consists of
three classes: parent, child, and overriding. The program illustrates how a child class can override a method from
its parent class and provides an example of runtime polymorphism.*/

import java.io.*;
import java.lang.*;

class parent
{
	public void display()
	{
		System.out.println("Display ::Parent");
	}
}

class child extends parent
{
	@Override
	public void display()
	{
		System.out.println("Display ::Child");
	}
}

class overriding
{
	public static void main(String args[])
	{
		child obj=new child();
		obj.display();
	}
}