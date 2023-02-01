package Question_03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Stack_Book B1 = new Stack_Book();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Know IT Library !");
		int ch;
		
		do {
		
		System.out.println("Please Enter Below Choice");
		System.out.println("1. Add Book 2. Delete Record 3.Check Library Data , 0.Exit");
		
		ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			{
				System.out.println("Enter Book ID - ");
				int bid = sc.nextInt();
				System.out.println("Enter Book Title - ");
				String title = sc.next();
				System.out.println("Enter Book Price - ");
				double price = sc.nextDouble();
				Book b = new Book(bid , title , price);
				B1.push(b);
				System.out.println("Book Added");
				break;
			}
		case 2:
			{
				B1.pop();
				System.out.println("Book Deleted from Stack");
				break;
			}
		case 3:
			{
				B1.Display();
				break;
			}
		default :
		{
			System.out.println("Enter Correct Option !");
			break;
		}
		
		}
		
		}
		while (ch != 0);
		
		
	}

}
