package Question_02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		LinkedList cities=new LinkedList();
		int ch=1;;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Add At End\t4. Display");
			System.out.println("2. First Node \t5. Last Node");
			System.out.println(" Enter Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter String To Insert ");
				String name=sc.next();
				cities.addNode(name);
				break;
			case 2:
				Node temp=new Node();
				temp=cities.firstNode();
				System.out.println(temp);
				break;
				
			case 4:
			   cities.display();
			}
			
		}while(ch!=0);
		
		
	}
}
