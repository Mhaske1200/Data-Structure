package Circular_Queue;

public class C_Queue 
{
	int size , front , rear;
	int arr[];
	
	public C_Queue() 
	{
		size = 5;
		front = rear = -1;
		arr = new int[size];
	}
	public C_Queue(int size)
	{
		this.size = size;
		front = rear = -1;
		arr = new int[size];
	}
	public boolean isFull()
	{
		return (rear+1)%size == front;
	}
	public boolean isEmpty()
	{
		return front == -1;
	}
	
	public void enqueue(int data)
	{
		if(!isFull())
		{
			if(front == -1)
				front = (front+1)%size;
				rear = (rear+1)%size;
				arr[rear] = data;
		}
		else
		{
			System.out.println("Queue is Full !");
		}
	}
	
	public int dequeue()
	{
		int data = -9999;
		if(!isEmpty())
		{
			data = arr[front];
			if(front == rear)
			{
				front = rear = -1;
			}
			else 
			{
			front = (front+1)%size;
			}
		}
		return data;
		
	}
	public void display()
	{
		int i;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		
		System.out.print("Front = "+front+"----->");
		
		for(i= front ; i != rear ; i =(i+1)%size)
		{
			System.out.print("\t"+arr[i]+"\t");
		}
		if(i == rear)
		{
			System.out.print("\t"+arr[i]+"\t");
		}
		System.out.print("<--------"+rear+" = Rear");
		System.out.println();
	}

}
