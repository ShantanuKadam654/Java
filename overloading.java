/*This Java program illustrates the concept of method overloading, where multiple methods share the same
name (display()) but differ in their parameter lists. In this example, the method display() is overloaded
to accept both int and double types, demonstrating how Java resolves method calls based on the method signature.*/

import java.io.*;
import java.lang.*;

class overload
{
	public void display(int a,int b)
	{
		System.out.println("Addition of Integer:"+(a+b));
	}

	public void display(double a,double b)
	{
		System.out.println("Addition of Double:"+(a+b));
	}
}

class overloading
{
	public static void main(String args[])
	{
		overload obj=new overload();

		obj.display(1.5,5.5);
		obj.display(1,5);
	}
}