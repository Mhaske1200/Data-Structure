package UserDefineDataTypeLL;

import java.util.Scanner;

public class LinkedList {
	Node head;
	public LinkedList()
	{
		head=null;
	}
	public Node getHead()
	{
		return head;
	}
	public void add(Employee data)
	{
		Node record=new Node(data);
		if(head==null)
			head=record;
		else
		{
			Node move=head;
			while(move.next!=null)
				move=move.next;
			move.next=record;
		}
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println(" Linked List Is Empty !!! ");
			return;
		}
		 Node move=head;
		 System.out.println();
		 while(move!=null)
		{
		  System.out.print(move.data);
			 move=move.next;
		 }
		 System.out.println();
	}   
	//200  data=e1    400
	//   11 a 33    22 b 33      33 vv 55       44 dd 666 
	
	// 33
	
	
	public void modify(int eid)
	{
		Node move;
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		for(move=head;move!=null;move=move.next)
		{
			if(move.data.getEid()==eid)
			{
				flag=true;
				Employee e1;
				int e;
				String name;
				double sal;
				System.out.println(" Enter New Eid Name And Salary ");
				e=sc.nextInt();
				name=sc.next();
				sal=sc.nextDouble();
				e1=new  Employee(e,name,sal);
				move.data=e1;
				
			}
				}
		if(flag==false)
			System.out.println( "Data Not found ");
		
	}

	

}
