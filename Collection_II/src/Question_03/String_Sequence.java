package Question_03;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class String_Sequence {

	public static void main(String[] args) 
	{
		String s[] = new String [5];
		Set<String> set = new TreeSet<>(
				(String s1 , String s2) ->
				{
					int diff;
					diff = s1.length() - s2.length();
					if(diff == 0)
					{
						diff = s1.compareTo(s2);
					}
					return diff;
				}
				);
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<5 ; i++)
		{
		System.out.println("Enter Strings - ");
		s[i] = sc.next();
		set.add(s[i]);
		}
		
		System.out.println(set);
		
		
		
	}

}
