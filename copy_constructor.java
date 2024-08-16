import java.lang.*;
import java.io.*;

class copy_const
{
	int a,b;

	public copy_const(int a,int b)
	{
		System.out.println("Value of A:"+a);
		System.out.println("Value of B:"+b);
	}

	public copy_const(copy_const copy)
	{
		a=copy.a;
		b=copy.b;

		System.out.println("Value of Copy :: A:"+a);
		System.out.println("Value of Copy :: B:"+b);
	}
}

class copy_constructor
{
	public static void main(String args[])
	{
		copy_const obj1=new copy_const(11,1);
		copy_const objq=new copy_const(obj1);
	}
}