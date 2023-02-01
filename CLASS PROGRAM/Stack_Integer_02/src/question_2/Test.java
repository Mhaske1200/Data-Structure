package question_2;

import java.util.Scanner;

public class Test {
	public static int postfixEva(String str)
	{
		int res=0;
		char ch;
		int no;
		Stack s1=new Stack(str.length());
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>=97 && ch<=122))
			{
				System.out.println("Enter Value For "+ch);
				no=sc.nextInt();
				s1.Push(no);
			}
			else
			{
				int no1=s1.Pop();
				int no2=s1.Pop();
				switch(ch)
				{
				case '+':
					res=no2+no1;
					break;
				case '-':
					res=no2-no1;
					break;
				case '*':
					res=no2*no1;
					break;
				case '/':
					res=no2/no1;
					break;
				}
				s1.Push(res);
		    	}
			}
		res=s1.Pop();
			return res;
	
	}
	public static void main(String[] args) {
	
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Postfix Expression ");
		str=sc.next();
		int res=postfixEva(str);
		System.out.println(" Result "+res);
	}

}
