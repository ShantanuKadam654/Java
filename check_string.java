package Primary;

import java.io.*;
import java.lang.*;

class error extends Exception
{
	public void display()
	{
		System.out.println("Strings are not same..");
	}
}

class ch_str
{
	String one;
	String two;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter First String:");
			one=br.readLine();

			System.out.println("Enter Second String:");
			two=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void check()
	{
		try
		{
			if(one.equalsIgnoreCase(two))
			{
				System.out.println("Both Strings Are Same..");
			}
			else
			{
				throw new error();
			}
		}
		catch(error r)
		{
			r.display();
		}
	}
}

class check_string
{
	public static void main(String args[])
	{
		ch_str d=new ch_str();
		d.accept();
		d.check();
	}
}