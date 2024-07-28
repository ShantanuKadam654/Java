package Primary;

import java.io.*;
import java.lang.*;

class Zero extends Exception
{
	public void display()
	{
		System.out.println("Number is Zero..");
	}
}

class demo
{
	int no=0; 
	int rev=0;
	int rem=0;

	public void accept()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Digits:");
			no=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void check()  throws Zero
	{
		if(no==0)
		{
			throw new Zero();
		}
		else
		{
			while(no!=0)
			{
				rem=no%10;
				rev=(rev*10)+rem;
				no=no/10;
			}

			System.out.println("Reverce Of Digit :"+rev);
		}
	}
}

class reverce_throws
{
	public static void main(String args[])
	{
		demo d=new demo();
		d.accept();

		try
		{
			d.check();
		}
		catch(Zero Z)
		{
			Z.display();
		}
	}
}