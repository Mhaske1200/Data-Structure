package Question_01;

public class MyQueue {
	int size,front,rear;
	String []arr;
	public MyQueue()
	{
		size=5;
		front=rear=-1;
		arr=new String[size];
	}
	public MyQueue(int sz)
	{
		size=sz;
		front=rear=-1;
		arr=new String[size];
	}
	public boolean isEmpty()
	{
		return front==-1;
	}
	public boolean isFull()
	{
		return rear==size-1;
	}
	public void enQueue(String data)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear++;
			arr[rear]=data;
		}
	}
	public String deQueue()
	{
		String data=null;
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
	public void display()
	{
		if(isEmpty())
		{
			System.out.println(" Queue Is Empty ");
			return;
		}
		System.out.println("<--front "+front);
		System.out.println();
		for(int i=front;i<=rear;i++)
			System.out.print("  "+arr[i]);
		System.out.println();
		System.out.println("<--rear "+rear);
		
	}

}
