package Question_03;

public class Stack_Book 
{
	int top = -1;
	int size;
	Book arr[];
	
	Stack_Book()
	{
		top = -1;
		size = 5;
		arr = new Book[size];
	}
	Stack_Book(int size)
	{
		this.top = -1;
		this.size = 5;
		arr = new Book[size];
	}
	public boolean isEmpty()
	{
	     if(top == -1)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{ 
		if (top == size-1)
			return true;
		else 
			return false;
	}
	public void push(Book data)
	{
		if(!isFull())
			arr[++top]=data;
		else
			System.out.println("Stack is Full !");
	}
	public Book pop()
	{
		Book data = null;
		if(!isEmpty())
			data = arr[top--];
		
		return data;
	}
	
	public void Display()
	{
		for(int i =top; i>=0; i--)
		{
			arr[i].display();
		}
	}
	

}
