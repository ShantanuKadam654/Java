import java.io.*;
import java.lang.*;

class binary
{
	public static void main(String args[])
	{
		int x = 5 ,y = 10;

		first:
		{
			second:
			{
				third:
				{
					if(x == y >> 1)
					{
						break second;
					}
				}
				System.out.println(x);
			}
			System.out.println(y);
		}
	}
}