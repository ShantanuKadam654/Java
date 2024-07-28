package Primary;

import java.lang.*;

class swap
{
	public static void main(String args[])
	{
		int a=0;
		int b=0;
		int temp=0;

			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);

			System.out.println("Before Swapping..");
			System.out.println("Value Of A :"+a);
			System.out.println("Value Of B :"+b);

			temp=a;
			a=b;
			b=temp;

			System.out.println("After Swapping..");
			System.out.println("Value Of A :"+a);
			System.out.println("Value Of B :"+b);
	}
}