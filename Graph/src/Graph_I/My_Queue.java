package Graph_I;

public class My_Queue 
{
	int size;
	int rear , front;
	int a[];
	
	public My_Queue() 
	{
		size = 5;
		rear = front = -1;
		a = new int[size];
	}
	public My_Queue(int size)
	{
		this.size = size;
		rear = front = -1;
		a = new int[size];
	}
	public boolean isFull()
	{
		return rear == size-1;
	}
	public boolean isEmpty()
	{
		return front == -1 && rear == -1;
	}
	public void enqueue(int data)
	{
		if(!isFull())
		{
			rear ++;
			a[rear] = data;
		}
		else
			System.out.println("Queue is Full !");
	}
	public int dequeue()
	{
		int data = -9999;
		if(!isEmpty())
		{
			data = a[front];
			front++;
		}
		else
		{
			System.out.println("Stack is Empty !");
		}
		
		return data;
	}
	
	public void display()
	{
		System.out.println("FRONT ------>");
		for(int i = front ; i <= rear ; i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("<------- Rear ");
		System.out.println();
	}
}
