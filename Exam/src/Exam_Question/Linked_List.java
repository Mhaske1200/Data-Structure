package Exam_Question;

import java.util.Scanner;

public class Linked_List 
{
Node head;
	
	Linked_List()
	{
		head= null;
	}
	
		
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public  void add(int data)
	{
		Node move;
		
		Node record = new Node(data);
		
		if(head == null)
			head = record;
		else
		{
			move = head;
			while(move.getNext() != null)
				move = move.getNext();
			
			move.setNext(record);
		}
	}
	
	public void createList (int num)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements to Add in List :::: ");
		for(int i = 1 ; i<=num ; i++)
		{
			System.out.println("Add Element "+i+" :: :: ");
			add(sc.nextInt());
		}
	}
	public void createListEven ()
	{
		int n = 0;
		for(int i = 0 ; i<10 ; i++)
		{
			n= n+2;
			add(n);
		}
	}
	public void createListOdd ()
	{
		int n = 1;
		for(int i = 0 ; i<=10 ; i++)
		{
			n= n+2;
			add(n);
		}
	}
	
	public void addNodeBegin(int data)
	{
		Node record = new Node(data);
		record.next = head;
		head = record;
	}
	
	public void addNodeLast(int data)
	{
		Node move;
		Node record = new Node(data);
		for(move = head ; move.next != null ; move = move.next);
		move.next = record;
	}
	
	public void addNodemid(int data , int pos)
	{
		Node move = head;
		Node record = new Node(data);
		for(int i =1; i<pos-1 ; i++)
		{
			move = move.next;
		}
		record.next = move.next;
		move.next = record;
	}
	
	public void deleteNodeMid(int pos)
	{
		Node move = head;
		for(int i=1 ; i<pos-1;i++)
		{
			move = move.next;
		}
		move.next= move.next.next;
	}
	
	public void deleteBeg()
	{
		head = head.next;
	}
	public void deleteEnd()
	{
		Node move;
		for(move = head ; move.next.next != null ; move = move.next);
		move.next = null;
	}
	
	public int countNode()
	{
		int cnt=0;
		Node move;
		
		for(move=head ; move != null ; move = move.next , cnt++);
		
		return cnt;
	}
	
	public int findMax()
	{
		Node move = head;
		int max = 0;
		for(move = head ; move !=null ; move = move.next)
		{
			if(move.data > max)
			{
				max= move.data;
			}
		}
		return max;
	}
	
	public Node printFirstNode()
	{
		return head;
	}
	
	public Node printLastNode()
	{ 
		Node move;
		for(move = head ; move.next!=null ; move = move.next);
		
		return move;
	}
	
	public void display()
	{
		Node move;
		for(move = head ; move != null ; move = move.next)
		{
			System.out.print("\t"+move.data+"\t");
		}
		System.out.println();
	}
	
	
	
	public void PrintReverseData(Node head)
	{
		if(head != null)
		{
			PrintReverseData(head.next);
			System.out.print("\t"+head.data+"\t");
		}
		
	}
	
	public void ReverseList()
	{
		Node p1, p2 , p3;
		
		p1 = head;
		p2 = head.next;
		p3 = p2.next;
		
		while(p2!=null)
		{
			p2.next = p1;
			p1 = p2;
			p2=p3;
			if(p3!=null)
				p3 = p3.next;
		}
		head.next = null;
		head = p1;
		
	}
	
	public void findAtpos(int pos)
	{
		Node move = head;
		for(int i = 1 ; i<pos-1 ; i++)
		{
			move = move.next;
		}
		System.out.println("\t"+move.next.data+"\t");
	}
	
	
	
	public void merge(Linked_List l2)
	{
		Node move;
		move = head;
		while(move.next != null)
		move = move.next;
			
		move.next = l2.head;
		
	}

}
