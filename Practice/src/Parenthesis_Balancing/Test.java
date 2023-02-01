package Parenthesis_Balancing;

import java.util.Scanner;

import Stack.Stack;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String d = sc.next();
		Stack s = new Stack(d.length());
		boolean flag = true;
		for(int i = 0 ; i<d.length(); i++)
		{
			if((d.charAt(i) == '{') || (d.charAt(i) == '(') || (d.charAt(i) == '[')  )
			{
				s.push(d.charAt(i));
			}
			else if((d.charAt(i) == '}' && s.pop() != '{' ) || (d.charAt(i) == ')' && s.pop() != '(' ) || (d.charAt(i) == ']' && s.pop() != '[' ))
			{
				flag = false;
			}
		}
		
		if(flag && s.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
		

	}

}
