package Stack;

import java.util.Arrays;

public class Stack 
{
	int top , size;
	int arr [];
	
	public Stack()
	{
		size = 5;
		top = -1;
		arr = new int[size];
	}
	public Stack(int size)
	{
		this.size = size;
		top = -1;
		arr = new int[size];
	}
	
	public boolean isFull()
	{
		return top == size -1;
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void push(int data)
	{
		if(!isFull())
		{
			arr[++top] = data;
		}
		else
		{
			System.out.println("Stack is Full");
		}
	}
	public int pop()
	{
		int data = -9999;
		if(!isEmpty())
		{
			data = arr[top--];
		}
		else if (data == -9999)
		{
			System.out.println("Data Not Poped Out");
		}
		
		return data;
	}
	public void display()
	{
		for(int i = top ; i >=0 ; i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	

}
