package Question_02;

public class Stack_String 
{
	int size;
	String arr[];
	int top;
public Stack_String()
	{
	size = 5;
	top = -1;
	arr= new String [size]; 
	}
public Stack_String(int size)
	{
	this.size = size;
	this.top = -1;
	arr = new String [size];
	}
public boolean isEmpty()
	{
	if(top== -1)
		return true;
	else
		return false;
	}
public boolean isFull()
	{
	if(top== size-1)
		return true;
	else
		return false;
	}
public void push(String str)
	{
	if (!isFull())
		arr[++top]=str;
	else
		System.out.println("Stack is full");
	}
public String pop()
{
	String str = null;
if (!isEmpty())
	str = arr[top--];
else
	System.out.println("Stack is empty");
	return str;
}
public void Display()
	{
	for(int i=top; i>=0; i--)
	{
		System.out.println(arr[i]);
	}
	}
	
	
}
