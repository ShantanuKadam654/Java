/*This program showcases how to create an infinite loop, handle user input, and control the loop’s flow based
on the input.It demonstrates a simple infinite loop that prompts the user for input and processes their response
to either continue the loop or exit.*/

import java.io.*;
import java.lang.*;
import java.util.*;

class infinite
{
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		String ans;

		for(;;)
		{
			System.out.println("Do you want to continue?");
			ans=sc.nextLine();

			if(ans.equals("no") || ans.equals("No"))
			{
				break;
			}
			else
			{
				if(ans.equals("yes") || ans.equals("Yes"))
				{
					continue;
				}
				else
				{
					System.out.println("Please mention in 'Yes' or 'No'");
				}
			}
		}
	}
}

class infinite_loop
{
	public static void main(String args[])
	{
		infinite obj=new infinite();
		obj.display();
	}
}