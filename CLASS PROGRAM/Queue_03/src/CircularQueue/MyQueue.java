package CircularQueue;

public class MyQueue {
	String arr[];
	int size,rear,front;
	public MyQueue()
	{
		size=5;
		rear=front=-1;
		arr=new String[size];
	}
	public boolean isFull()
	{
		return (front==(rear+1)%size);
	}
	public boolean isEmpty()
	{
		return front==-1;
	}
	public void enQueue(String str)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=str;
		}
		else
			System.out.println(" Queue Is Full ");
	}
	public String deQueue()
	{
		String str=null;
		if(!isEmpty())
		{
			str=arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%size;
		}
		return str;
	}
	public void display()
	{
		int i;
		if(isEmpty())
		{
			System.out.println(" Queue Is Empty !!! ");
			return;
		}
		System.out.println(" Front : "+front);
		for(i=front;i!=rear;i=(i+1)%size)
			
			System.out.print(" "+arr[i]);
		if(i==rear)
			System.out.print(" "+arr[i]);
		System.out.println();
		System.out.println(" Rear : "+rear);
		 
	}
	
}
