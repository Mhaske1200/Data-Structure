package question_2;

public class Stack {
	int top,size;
	int []arr;
	public Stack()
	{
		top=-1;
		size=5;
		arr=new int[size];
	}
	public Stack(int size)
	{
		top=-1;
		this.size=size;
		arr=new int[size];
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public void Push(int ele)
	{
		if(!isFull())
	    	arr[++top]=ele;
		else
			System.out.println("Stack Is Full !!! ");
	}
	public int Pop()
	{
		int data=-9999;
		if(!isEmpty())
		{
			data=arr[top--];
		}
		return data;
	}
}
