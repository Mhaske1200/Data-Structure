package Question_04;

import java.util.Scanner;

public class PostFix_Evaluation {

	public static int Evaluate(String s)
	{
		Scanner sc = new Scanner(System.in);
		Stack s90 = new Stack(s.length());
		int res = 0;

		for(int i=0 ; i<s.length() ;i++)
		{
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i)<='z')
			{
				System.out.println("Enter Value of "+s.charAt(i)+" :: ::");
				int x = sc.nextInt();
				s90.push(x);
			}
			else
			{
				int num1 = s90.pop();
				int num2 = s90.pop();
				
				switch(s.charAt(i))
				{
				case '+' :
					
						res = num2 +num1;
						break;
					
				case '-' :
				
					res = num2 -num1;
					break;
				
				case '*' :
				
					res = num2 *num1;
					break;
				
				case '/' :
				
					res = num2 /num1;
					break;
				
				default:
				
					System.out.println("Wrong Operator");
				
				}
				s90.push(res);
			}
			
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Post Fix Expression - ");
		String s = sc.next();
		
		System.out.println(Evaluate(s));

	}

}
