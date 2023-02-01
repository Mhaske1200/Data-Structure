package Question_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MAP {

	public static void main(String[] args) 
	{
		Map<Integer, String> map = new HashMap<>();
		
		map.put(null, "C Program");
		map.put(20, "C++ Program");
		map.put(30, "JAVA Program");
		map.put(40, "WEB Program");
		map.put(50, "Data Base Tech");
		map.put(10, "Data Structure");
		
		System.out.println(map);

		Set<Map.Entry<Integer , String>> set = map.entrySet();
		
		System.out.println(set);
		
		for( Map.Entry<Integer,String> e : set )
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
	}

}
