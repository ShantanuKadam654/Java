package Primary;

import java.io.*;
import java.lang.*;

class excep extends Exception
{
	public excep()
	{
		System.out.println("You are not Eligible..");
	}
}

class demo
{
	int age=0;

	public demo()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Your Age:");
			age=Integer.parseInt(br.readLine());

			try
			{
				if(age>=18)
				{
					System.out.println("You Are Eligible");
				}
				else
				{
					throw new excep();
				}
			}
			catch(excep ne)
			{
				System.out.println(ne);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class execption_age
{
	public static void main(String args[])
	{
		demo d1=new demo();
	}
}