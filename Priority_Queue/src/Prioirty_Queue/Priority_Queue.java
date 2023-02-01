package Prioirty_Queue;

public class Priority_Queue 
{
	int size , front , rear;
	Element arr[];
	
	Priority_Queue()
	{
		size = 5;
		front = rear = -1;
		arr = new Element [size];
	}
	Priority_Queue(int size)
	{
		this.size = size;
		front = rear = -1;
		arr = new Element [size];
	}
	public boolean isFull()
	{
		return rear == size-1;
	}
	public boolean isEmpty()
	{
		return front == -1;
	}
	
	public void enqueue(Element data)
	{
		Element temp;
		if(!isFull())
		{
			if(front == -1)
				front =0;
			arr[++rear] = data;
			
			int mysize = rear;
			for(int i=0 ; i<mysize ; i++)
			{
				for(int j=0;j<mysize;j++)
				{
					if(arr[j].getPriority()<arr[j+1].getPriority())
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
	}
	
	public Element dequeue()
	{
		Element data = null;
		if(!isEmpty())
		{
			data = arr[front];
			if(front == rear)
				front = rear = -1;
			else
				front++;
		}
		return data;
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty !");
		}
		System.out.println();
		for(int i=front;i<=rear; i++)
			System.out.print("\t"+arr[i].getData()+"\t");
		System.out.println();
		for(int i=front;i<=rear; i++)
		System.out.print("\t"+arr[i].getPriority()+"\t");
	}
	
	
}
