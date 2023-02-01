package Question_01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		MyQueue queue =new MyQueue(5);
		int ch=1;
		String data;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Enqueue");
			System.out.println("2. DEqueue");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			System.out.println(" Enter Your Chocie ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter String ");
				data=sc.next();
				queue.enQueue(data);
				queue.display();
				break;
			case 2:
				data=queue.deQueue();
				System.out.println("Deleted Data : "+data);
				queue.display();
				break;
				
				
			}
		}while(ch!=0);
		
	}
}
