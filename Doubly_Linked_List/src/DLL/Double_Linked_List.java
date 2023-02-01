package DLL;

import java.util.Scanner;

public class Double_Linked_List 
{
	Node head;
	
	public Double_Linked_List() 
	{
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void add(int data)
	{
		Node move = head;
		Node record = new Node(data);
		if(head == null)
			head = record;
		else
		{
		while(move.next != null)
			move = move.next;
		move.next = record;
		record.previous = move;
		}
					
	}
	public void createLinked_List(int num)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; i <=num ; i++)
		{
			System.out.println("Enter Data to Add in List :: :: ");
			int x = sc.nextInt();
			add(x);
		}
	}
	
	public void delete()
	{
		Node move;
		if(head == null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			for(move = head ; move.next.next!= null ; move = move.next);
			move.next = null;
		}
	}
	
	public void deleteAtPos(int pos)
	{
		Node move = head;
		for(int i =1 ; i<pos-1 ; i++)
		{
			move = move.next;
		}
		move.next = move.next.next;
		move.next.previous = move;
	}
	
	public void modify(int pos)
	{
		Scanner sc = new Scanner(System.in);
		Node move = head;
		for(int i = 1 ; i < pos-1 ; i++)
		{
			move = move.next;
		}
		System.out.println("Enter New Value :: ");
		int data = sc.nextInt();
		move.next.setData(data);
		
	}
	
	public void display()
	{
		Node move;
		if(head == null)
		{
			System.out.println(" List is Empty !");
			return;
		}
		for(move = head ; move!=null ; move = move.next)
		{
			System.out.print("\t"+move.data+"\t");
		}
		System.out.println();
	}

	public void ReverseList()
	{
		Node move;
		for(move = head ; move.next!=null ; move = move.next);
		while(move!=head)
		{
			System.out.print("\t"+move.data+"\t");
			move = move.previous;
		}
		if(move == head)
		{
			System.out.print("\t"+move.data+"\t");
		}
		
	}
	
}
