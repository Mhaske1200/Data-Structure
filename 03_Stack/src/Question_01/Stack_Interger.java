package Question_01;

public class Stack_Interger {
	int arr[];
	int size;
	int top;
	
	public Stack_Interger()
	{
		size = 5;
		top = -1;
		arr = new int [size];
	}
	public Stack_Interger(int size)
	{
		this.top = -1;
		this.size = size;
		arr = new int[size];
	}
	public boolean isEmpty()
	{
		if(top==-1)
		return true;
		
		else 
		return false;
	}
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		
		else
			return false;
	}
	public void push(int data)
	{
		if(isFull() != true)
		{
			arr[++top]=data;
		}
		else
			System.out.println("Stack is Full !");
	}
	public int pop()
	{
		int data = -9999;
		if(isEmpty() != true)
		{
			data = arr[top--];
		}
		return data;
	}
	public void display()
	{
		for(int i =top ; i>=0 ; i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	
}
