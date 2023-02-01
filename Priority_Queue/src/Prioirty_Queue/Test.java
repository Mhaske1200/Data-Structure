package Prioirty_Queue;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Priority_Queue p90 = new Priority_Queue();
		
		int ch;
		Element data;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<p90.size ; i++)
		{
		System.out.println(" Enter Data");
	    int d=sc.nextInt();
	    System.out.println(" Enter Priority");
	    int p=sc.nextInt();
	    
	    data = new Element (d,p);
	    p90.enqueue(data);
		}
	    p90.display();
		

	}

}
