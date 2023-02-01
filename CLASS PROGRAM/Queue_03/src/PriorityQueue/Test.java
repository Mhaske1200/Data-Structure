package PriorityQueue;

import java.util.Scanner;

class Element
{
	int data,pri;
	public Element()
	{
		
	}
	public Element(int data,int pri)
	{
		this.data=data;
		this.pri=pri;
	}
	@Override
	public String toString() {
		return "Element [data=" + data + ", pri=" + pri + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getPri() {
		return pri;
	}

	public void setPri(int pri) {
		this.pri = pri;
	}
	
}

class Queue
{
	int size,rear,front;
	Element []arr;
	public Queue()
	{
		size=5;
		rear=front=-1;
		arr=new Element[size];
	}
	public Queue(int s)
	{
		size=s;
		rear=front=-1;
		arr=new Element[size];
	}
	public void enQueue(Element data)
	{
		Element temp;
		if(!isFull())
		{
			// ************* insert data in Queue ******
			if(front==-1)
				front=0;
			rear++;
			arr[rear]=data;
			//************ sort Queue **************
			int mysize=rear;
			for(int i=0;i<mysize;i++)
			{
				for(int j=0;j<mysize-i;j++)
				{
					if(arr[j].getPri()<arr[j+1].getPri())
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
			
		}
		
	}
	public void display()
	{
		System.out.println();
		for(int i=front;i<=rear;i++)
			System.out.print("\t"+arr[i].getData());
		System.out.println();
		for(int i=front;i<=rear;i++)
			System.out.print("\t"+arr[i].getPri());
	}
	public Element deQueue()
	{
		Element data=null;
		if(!isEmpty())
		{
			data=arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front++;
		}
		return data;
	}
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
		
	}
	public boolean isFull()
	{
		if(rear==size-1)
			return true;
		else
			return false;
	
	}
		
	}

public class Test {

	public static void main(String[] args) {

     Queue q1=new Queue();
     int ch;
     Element data;
     
     Scanner sc=new Scanner(System.in);
    System.out.println(" Enter Data Andd Priority ");
    int d=sc.nextInt();
    int p=sc.nextInt();
    data=new Element(d,p);
     q1.enQueue(data);
   q1.display();
   
   System.out.println(" Enter Data Andd Priority ");
        d=sc.nextInt();
        p=sc.nextInt();
       data=new Element(d,p);
          q1.enQueue(data);
          q1.display();
        
          System.out.println(" Enter Data Andd Priority ");
           d=sc.nextInt();
           p=sc.nextInt();
          data=new Element(d,p);
            q1.enQueue(data);
             q1.display();
             
    
    	 
     }


	}


