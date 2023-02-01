package Question_02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Stack_String S100 = new Stack_String(10);
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter City Names - ");
		
		for(int i = 0 ; i<7 ; i++)
		{
			S100.push(sc.next());
		}
		S100.Display();
		
	}

}
