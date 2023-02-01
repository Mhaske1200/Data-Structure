package Binary_Search_Tree;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		Binary_Search_Tree bt = new Binary_Search_Tree();

		do
		{
			System.out.println("*****Welcome*****");
			System.out.println("Please Enter 1. ADD 2.Dispaly 3. FindMax 4. FindMin 5. Search 6. Count of Node 7. Delete  8. Height  0. EXIT");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: 
			{
				System.out.println("Enter Data in Tree :: ");
				bt.addNode(sc.nextInt());
				break;
			}
			case 2:
			{
				bt.display();
				break;
			}
			case 3:
			{
				System.out.println("Maximum Element of Tree = "+bt.FindMax());
				break;
			}
			case 4:
			{
				System.out.println("Minimum Element of Tree = "+bt.FindMin());
				break;
			}
			case 5:
			{
				if(bt.search())
				{
					System.out.println("Data Found !");
				}
				else
				{
					System.out.println("Not Found !");
				}
				break;
			}
			case 6:
			{
				System.out.println(bt.Count()+" Number of Nodes Available in Tree ");
				break;
			}
			case 7:
			{
				System.out.println("Enter Element to Delete :: ");
				int x = sc.nextInt();
				bt.delete(x);
				System.out.println("Element Deleted - "+x);
				break;
			}
			case 8:
			{
				System.out.println("Height of Tree = "+bt.height(bt.getRoot()));
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
