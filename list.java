import java.io.*;
import java.lang.*;
import java.util.*;

class list
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();

		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one"); //accept duplicate items

		System.out.println("List Items :"+list);
	}
}
