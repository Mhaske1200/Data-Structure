package Question_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CocaCola {

	public static void main(String[] args) 
	{
		Map <Character,Integer> map =new HashMap<>(); 
		
		String s="coccacola";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				int n;
				n=map.get(ch);
				n++;
				map.put(ch, n);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		Set<Entry<Character,Integer>> set = map.entrySet();
		for(Entry chint : set)
		{
			System.out.println(chint.getKey()+" occuring "+chint.getValue()+" times");
		}
					

	}

}
