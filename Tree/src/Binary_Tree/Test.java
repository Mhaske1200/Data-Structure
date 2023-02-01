package Binary_Tree;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		Binary_Tree bt = new Binary_Tree();

		do
		{
			System.out.println("*****Welcome*****");
			System.out.println("Please Enter 1. ADD 2.Dispaly 0. EXIT");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: 
			{
				System.out.println("Enter String to Enter in Tree :: ");
				bt.addNode(sc.next());
				break;
			}
			case 2:
			{
				bt.display();
				break;
			}
			default :
			{
				System.out.println("Wrong Choice Entered !");
				break;
			}
			}
		} while(ch!=0);
	}

}
