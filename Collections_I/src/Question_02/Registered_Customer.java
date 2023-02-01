package Question_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Registered_Customer extends Customer
{
	int regno;
	
	public Registered_Customer() 
	{
		super();
		regno = 0;
	}
	
	public Registered_Customer(String name, String emailid, String contactno, int regno) 
	{
		super(name, emailid, contactno);
		this.regno = regno;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Registered_Customer [regno=" + regno + "]";
	}


	public static void main(String[] args) throws IOException 
	{
		Customer [] c = new Customer [3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<c.length ; i++)
		{
		int ch;
		System.out.println("Please Enter to Add Customer in Portal - ");
		System.out.println("1. Registered Customer \n"
						 + "2. Non - Registered Customer \n"
						 + "0. Exit");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		{
		System.out.println("Enter Name - ");
		String name = sc.next();
		
		System.out.println("Enter Mail ID - ");
		String emailid = sc.next();
		
		System.out.println("Enter Mobile Number - ");
		String contactno = sc.next();
		
		System.out.println("Enter Registration Number  - ");
		int regno = sc.nextInt();
		
		c[i] = new Registered_Customer(name, emailid, contactno, regno);
		break;
		}
		
		case 2:
		{
			System.out.println("Enter Name - ");
			String name = sc.next();
			
			System.out.println("Enter Mail ID - ");
			String emailid = sc.next();
			
			System.out.println("Enter Mobile Number - ");
			String contactno = sc.next();
						
			c[i] = new Customer(name, emailid, contactno);
			
			break;
		}
		case 0:
		{
			break;
		}
		default:
		{
			System.out.println("Please Enter Valid Choice !");
			break;
		}
		
		}
		}
				
		ObjectOutputStream oos = null;
		try 
		{
			oos = new ObjectOutputStream(new FileOutputStream("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\JAVA.Cusdat.dat"));
			for(Customer i : c)
				oos.writeObject(i);
			System.out.println("Data Written in File !");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Please Visit Again !");
		}
		
		ObjectInputStream ois = null;
		try 
		{
			ois = new ObjectInputStream(new FileInputStream("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2022\\JAVA.Cusdat.dat"));
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("__________________________________________________________________________________________________________________");
ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D:\\SHUBHAM&VISHAL PGDAC_SEPT_2020\\JAVA.Cusdat.dat") );
		
		List <Customer >cust = new LinkedList<>();
		List <Registered_Customer>regcust = new LinkedList<>();
		
		int i =0;
		while(true)
		{
			System.out.println(i++);
			try
			{
				Object x = oi.readObject();
//				System.out.println(c);
				if(x instanceof Registered_Customer)
					regcust.add((Registered_Customer)x);
				else
					cust.add((Customer)x);
			}
			catch(Exception e)
			{
					break;
			}
		}
		oi.close();
		System.out.println("--------------REGULAR CUSTOMER--------------");
		for(Customer x: cust)
		{
			System.out.println(x);
		}
		System.out.println("--------------REGISTERD CUSTOMER--------------");
		for(Registered_Customer c1: regcust)
		{
			System.out.println(c1);
		}
		
	}
}


