package Question_03;

public class Char_Stack 
{
	int top;
	int size;
	char arr[];
	
	public Char_Stack() 
	{
		top = -1;
		size = 5;
		arr = new char [size];
	}
	public Char_Stack(int size)
	{
		top = -1;
		this.size = size;
		arr = new char [size];
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull()
	{
		return top == size-1;
	}
	public void push(char data)
	{
		if(!isFull())
		{
			arr[++top] = data;
		}
		else 
			System.out.println("Stack is Full !");
	}
	public char pop()
	{
		char data = '\0';
		if(!isEmpty())
		{
			data = arr[top--];
		}
		return data;		
	}

}
