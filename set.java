import java.io.*;
import java.lang.*;

import java.util.HashSet;
import java.util.Set;

class set
{
	public static void main(String args[])
	{
		Set<String> set = new HashSet<>();

		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one"); //ignore duplicate items

		System.out.println("Set items :"+set);
	}
}