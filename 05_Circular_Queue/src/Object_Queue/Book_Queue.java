package Object_Queue;

public class Book_Queue 
{
	int size , front , rear;
	Book arr[];
	
	Book_Queue()
	{
		size = 5;
		rear = -1;
		front = -1;
		arr = new Book [size];
	}
	Book_Queue(int size)
	{
		this.size = size;
		rear = -1;
		front = -1;
		arr = new Book [size];
	}
	public boolean isFull()
	{
		return front == (rear+1)%size;
	}
	public boolean isEmpty()
	{
		return front == -1;
	}
	public void enqueue(Book data)
	{
		if(!isFull())
		{
			if(front == -1)
				front=0;
			
			rear = (rear+1)%size;
			arr[rear]= data;
		}
		else
		{
			System.out.println("Queue is Full !");
		}
	}
	public Book dequeue()
	{
		Book data = null;
		if(!isEmpty())
		{
			data = arr[front];
			if(front == rear)
				front = rear = -1;
			else 
				front = (front+1)%rear;
		}
				
		return data;
	}
	public void dispaly()
	{
		int i;
		if(isEmpty())
		{
			System.out.println("Stack is Empty !");
			return;
		}
		
		System.out.print("Front = "+front+"----->");
		
		for(i =front ; i!= rear ; i=(i+1)%size)
		{
			System.out.print("\t"+arr[i]+"\t");
		}
		if(i==rear)
		{
			System.out.print("\t"+arr[i]+"\t");
		}
		
		System.out.print("<-----"+rear+" Rear");
		System.out.println();
		
		
		
	}
	
}
