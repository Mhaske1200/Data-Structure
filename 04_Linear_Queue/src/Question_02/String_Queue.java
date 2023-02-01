package Question_02;

public class String_Queue 
{
	int front;
	int rear;
	int size;
	String arr [];
	
	public String_Queue() 
	{
		front = -1;
		rear = -1;
		size =5;
		arr = new String [size];	
	}
	public String_Queue(int size)
	{
		front = -1;
		rear = -1;
		this.size = size;
		arr = new String [size];
	}
	
	public boolean isEmpty()
	{
		return front == -1;
	}
	public boolean isFull()
	{
		return rear == size-1;
	}
	
	public void enque(String data)
	{
		if(!isFull())
		{
			if(front == -1)
			front = 0;	
			rear ++;
			arr[rear] = data;
		}
		else
			System.out.println("Queue is Full !");
	}
	public String dequeue()
	{
		String data = null;
		
		if(!isEmpty())
		{
			data = arr[front];
			if(front == rear)
			{
				front = rear = -1;
			}
			else
			{
				front++;
			}
		}
		return data;
	}
	
	public void display()
	{
		System.out.print("Front ----->");
		for(int i =front; i<=rear; i++)
		{
			System.out.print("\t"+arr[i]+"\t");
		}
		System.out.print("<---- Rear");
		System.out.println();
	}
	

}
