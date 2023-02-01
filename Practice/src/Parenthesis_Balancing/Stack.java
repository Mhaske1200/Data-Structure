package Parenthesis_Balancing;

public class Stack 
{
	int top , size;
	char a[];

	Stack()
	{
		top = -1;
		size = 5;
		a = new char[size];
	}
	Stack(int size)
	{
		top = -1;
		this.size = size;
		a = new char[size];
	}
	public boolean isFull()
	{
		return top == size-1;
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public void push(char data)
	{
		if(!isFull())
		{
			a[++top] = data;
		}
		else
		{
			System.out.println("Stack is Full");
		}
	}
	public char pop()
	{
		char data = '\0';
		
		if(!isEmpty())
		{
			data = a[top--];
			if(top == 0)
			{
				top =-1;
			}
		}
		return data;		
	}
	
}
