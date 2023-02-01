package Question_03;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) 
	{
		
		Queue<String> Q = new PriorityQueue<>(new Comparator<String>() 
		{

			@Override
			public int compare(String o1, String o2) 
			{
				int diff;
				diff = o1.length() - o2.length();
				if(diff == 0)
				{
					diff = o1.compareTo(o2);
				}
				return diff;
			}
			
		}
		);
		
		
		Q.add("client");
		Q.add("web");
		Q.add("html");
		Q.add("css");
		Q.add("js");
		Q.add("jquery");
		Q.add("ajax");
		Q.add("json");
		Q.add("node");
		Q.add("express");
		Q.add("react");
		Q.add("bootstrap");
		
	
		System.out.println(Q);
		
		System.out.println("Size - "+Q.size());
		
		while(!Q.isEmpty())
			System.out.println(Q.poll());
	}

}
