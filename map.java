import java.io.*;
import java.lang.*;

import java.util.HashMap;
import java.util.Map;

class map
{
	public static void main(String args[])
	{
		Map<Integer ,String> map = new HashMap<>();

		map.put(1 ,"One");
		map.put(2 ,"Two");
		map.put(3 ,"Three");
		map.put(1 ,"Updated One"); //updated 1

		System.out.println("Map :"+map);
	}
}