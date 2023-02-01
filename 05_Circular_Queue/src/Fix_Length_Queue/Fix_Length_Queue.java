package Fix_Length_Queue;

public class Fix_Length_Queue 
{
	int size , rear , front;
	String arr[];
	public Fix_Length_Queue() 
	{
		size = 5;
		rear = -1;
		front = -1;
		arr = new String [size];
	}
	public Fix_Length_Queue(int size)
	{
		this.size= size;
		rear = -1;
		front = -1;
		arr = new String[size];
	}
	public boolean isFull()
	{
		return front == (rear+1)%size;
	}
	public boolean isEmpty()
	{
		return front == -1;
	}
	public void enqueue(String data)
	{
		if(!isFull())
		{
			if(front == -1)
				front =0;
			rear = (rear+1)%size;
			arr[rear]=data;
		}
		else
		{
			System.out.println("Queue is Full !");
			dequeue();    // Delete 1st Element
			enqueue(data); // Add Element @ Rear
		}
	}
	public String dequeue()
	{
		String str = null;
		if(!isEmpty())
		{
			str = arr[front];
			if(front == rear)
				front = rear = -1;
			else 
				front = (front+1)%size;
		}
		return str;
	}
	
	public void display()
	{
		int i;
		if(isEmpty())
		{
			System.out.println("Stack is Empty !");
		}
		
		System.out.print("Front = "+front+"----->");
		
		for(i=front ; i != rear ; i=(i+1)%size)
		{
			System.out.print("\t"+arr[i]+"\t");
			
		}
		if(i==rear)
		{
			System.out.print("\t"+arr[i]+"\t");
		}
		
		System.out.print("<--------"+rear+" = Rear");
		System.out.println();
	}

}
