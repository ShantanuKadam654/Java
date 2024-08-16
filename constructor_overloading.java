/*This Java program demonstrates constructor overloading, a concept where multiple constructors are defined within
the same class with different parameter lists. Each constructor performs a different task based on the type and
number of arguments passed during object creation. The program contains two classes: const_overload and
constructor_overloading.*/

import java.io.*;
import java.lang.*;
import java.util.*;

class const_overload
{
	public const_overload(int a,int b)
	{
		System.out.println("1st Constructor :: Addition of Integers :"+(a+b));
	}

	public const_overload(double a,double b)
	{
		System.out.println("2nd Constructor :: Addition of Doubles :"+(a+b));
	}
}

class constructor_overloading
{
	public static void main(String args[])
	{
		const_overload obj=new const_overload(1.2,2.2);
		const_overload obj1=new const_overload(5,5);
	}
}