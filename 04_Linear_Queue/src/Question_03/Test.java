package Question_03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check Balancing Parenthesis :: :: ");
		
		String str = sc.next();
		
		check_balance(str);
	}

	public static void check_balance(String str)
	{
		Char_Stack c = new Char_Stack(str.length());
		
		char ch;
		boolean flag = true;
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			ch = str.charAt(i);
			if(ch =='(' || ch =='{' || ch == '[')
			{
				c.push(ch);
			}
			else if ((ch==')' && c.pop() != '(') || (ch==']' && c.pop() != '[') || (ch=='}' && c.pop() != '{'))
			{
				flag = false;
				break;
			}
		}
		if (flag && c.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		
	}
	
}
