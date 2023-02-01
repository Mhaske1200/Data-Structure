package Question_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Linked_List L1 = new Linked_List();
		
		L1.add(50);
		L1.add(60);
		System.out.println();
		System.out.println("Add Element @ Start :: :: ");
		L1.addNodeBegin(sc.nextInt());
				
		//L1.createList(3);
		System.out.println("Added Element @ First");
		L1.display();
		
		System.out.println();
		System.out.println("Add Element @ End :: :: ");
		L1.addNodeLast(sc.nextInt());
		System.out.println("Added Element @ Last");
		L1.display();
		
		L1.deleteBeg();
		System.out.println("Deleted 1st Element");
		L1.display();
		L1.deleteEnd();
		
		System.out.println("Deleted Last Element");
		L1.display();
		
		L1.addNodemid(55, 2);
		System.out.println("Element added in 2nd Position");
		L1.display();
		L1.deleteNodeMid(2);
		System.out.println("2nd Element Deleted");
		L1.display();
		
		System.out.println("Printing Reverse Data");
		L1.PrintReverseData(L1.getHead());
		
		
		System.out.println("\n Count of Node :: :: "+L1.countNode());
		System.out.println("First Node of List - "+L1.printFirstNode());
		System.out.println("Last Node of List - "+L1.printLastNode());
		System.out.println("Maximum Element of List - "+L1.findMax());
		
		/*
		 * L1.add(200); L1.add(210); L1.add(220); L1.add(230); L1.add(240); L1.add(250);
		 * L1.add(260); L1.display();
		 */
		
	}

}
