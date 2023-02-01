package Exam_II;

import java.util.Set;
import java.util.TreeSet;

public class Word_Strings_Collection {

	public static void main(String[] args) 
	{
		String s[] = new String[13];
		
		Set<String> set = new TreeSet<>(
				(String s1 , String s2)->
				{
					int diff;
					String[] x;
					String[] y;
					x = s1.split("\s+");
					y = s2.split("\s+");
					diff = x.length - y.length;
					if(diff == 0)
					{
						diff = s1.compareTo(s2);
					}
					return diff;
				}
				);
		
//		s[0] = "I am Running Tech Company";
//		s[1] = "Top Management is in Meeting";
//		s[2] = "Diwali Celebration is in Month of November";
//		s[3] = "What's the Agenda of Meeting";
//		s[4] = "Done";
//		
		s[0] = "a";
		s[1] = "a b";
		s[2] = "a b c ";
		s[3] = "a b c d ";
		s[4] = "a b c d e";
		s[5] = "abc mno pqr";
		s[6] = "abc xyz dbf";
		s[7] = "ew asf odf sadfa asdfa";
		s[8] = "abc er f";
		s[9] = "abc mno def";
		s[10] = "abc mno cmo";
		s[11] = "a b c";
		s[12] = "a b  c";
		set.add(s[0]);

		set.add(s[1]);

		set.add(s[2]);

		set.add(s[3]);

		set.add(s[4]);
		
		set.add(s[5]);
		
		set.add(s[6]);
		
		set.add(s[7]);
		
		set.add(s[8]);
		
		set.add(s[9]);
		
		set.add(s[10]);
		
		set.add(s[11]);
		
		set.add(s[12]);
		
		//System.out.println(set);
		
		for(String a : set)
		{
			System.out.println(a);
		}
	}

}
