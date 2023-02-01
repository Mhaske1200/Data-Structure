package Object_Linked_List;

import java.util.Scanner;

import Question_1.Node;

public class Linked_List 
{
	Node_emp head;
	
	Linked_List()
	{
		head= null;
	}
	
	public  void add(Employee data)
	{
		Node_emp move;
		
		Node_emp record = new Node_emp(data);
		
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
			System.out.println("Enter Name :: ");
			String name = sc.next();
			System.out.println("Enter Date :: ");
			int dd = sc.nextInt();
			System.out.println("Enter Month :: ");
			int mm = sc.nextInt();
			System.out.println("Enter Year :: ");
			int yy = sc.nextInt();
			System.out.println("Enter Empid :: ");
			int empid = sc.nextInt();
			System.out.println("Enter Salary :: ");
			double sal = sc.nextInt();
			
			Employee e = new Employee(name, dd, mm, yy, empid, sal);
			add(e);
		}
	}
	
	public void addNodeBegin(Employee data)
	{
		Node_emp record = new Node_emp(data);
		record.next = head;
		head = record;
	}
	
	public void addNodeLast(Employee data)
	{
		Node_emp move;
		Node_emp record = new Node_emp (data);
		for(move = head ; move.next != null ; move = move.next);
		move.next = record;
	}
	
	public void addNodemid(Employee data , int pos)
	{
		Node_emp move = head;
		Node_emp record = new Node_emp(data);
		for(int i =1; i<pos-1 ; i++)
		{
			move = move.next;
		}
		record.next = move.next;
		move.next = record;
	}
	
	public void deleteNodeMid(int pos)
	{
		Node_emp move = head;
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
		Node_emp move;
		for(move = head ; move.next.next != null ; move = move.next);
		move.next = null;
	}
	
	public int countNode()
	{
		int cnt=0;
		Node_emp move;
		
		for(move=head ; move != null ; move = move.next , cnt++);
		
		return cnt;
	}
	
		
	public Node_emp printFirstNode()
	{
		return head;
	}
	
	public Node_emp printLastNode()
	{ 
		Node_emp move;
		for(move = head ; move.next!=null ; move = move.next);
		
		return move;
	}
	
	public void display()
	{
		Node_emp move;
		for(move = head ; move != null ; move = move.next)
		{
			System.out.println("\t"+move.data+"\t");
		}
		System.out.println("**************************************");
		System.out.println();
	}
	
	public void modify(int empid)
	{
		Scanner sc = new Scanner(System.in);
		Node_emp move;
		for(move = head ; move != null ; move = move.next)
		{
			if(move.data.empid == empid)
			{
				Node_emp record = new Node_emp();
				System.out.println("Enter Name :: ");
				String name = sc.next();
				System.out.println("Enter Date :: ");
				int dd = sc.nextInt();
				System.out.println("Enter Month :: ");
				int mm = sc.nextInt();
				System.out.println("Enter Year :: ");
				int yy = sc.nextInt();
				System.out.println("Enter Empid :: ");
				int iempid = sc.nextInt();
				System.out.println("Enter Salary :: ");
				double sal = sc.nextInt();
				
				Employee e = new Employee(name, dd, mm, yy, iempid, sal);
				
				move.data = e;
			}
		}
	}

}
