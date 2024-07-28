package Primary;

import java.io.*;
import java.lang.*;

class error_name extends Exception
{
	public void display()
	{
		System.out.println("Invalid Name .");
	}
}

class demo1
{
	String name;
	int x=0;
	int ch=0;
	int i=0;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Name :");
			name=br.readLine();
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
			for(i=0;i<name.length();i++)
			{
				ch=name.charAt(i);

				if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
				{
					x=1;
				}
				else
				{
					throw new error_name();
				}
			}

			if(x==1)
			{
				System.out.println("Name Entered Successfully..");
			}
		}
		catch(error_name e)
		{
			e.display();
		}
	}
}

class valid_name
{
	public static void main(String args[])
	{
		demo1 d=new demo1();
		d.accept();
		d.check();
	}
}