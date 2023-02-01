package Question_01;

public class Integer_Queue 
{
	int front;
	int rear;
	int size;
	int arr[];
	
	Integer_Queue()
	{
		front = -1;
		rear =-1;
		size = 5;
		arr = new int [size];
	}
	Integer_Queue(int size)
	{
		this.front = -1;
		this.rear = -1;
		this.size = size;
		arr = new int [size];
	}
	
	public boolean isEmpty()
	{
		return front == -1;
	}
	
	public boolean isFull()
	{
		return rear == size -1;
	}
	
	public void enqueue(int n)
	{
		if(!isFull())
		{
			if(front == -1)
				front = 0;
			rear++;
			arr[rear] = n;
		}
		else
			System.out.println("Queue is FUll !");
	}
	
	public int dequeue()
	{
		int data = -9999;
		
		if(!isEmpty())
		{
			data = arr[front];
			if( front == rear)
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
	
	public void Display()
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
