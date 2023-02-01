
public class MyQueue {
	private int size;
	private int rear,front;
	private int arr[];
	
	public MyQueue(int size) {
		this.size=size;
		arr=new int[size];
		rear=front=-1;
		}
	public boolean isEmpty() {
		if(rear==front) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isFull() {
		if(rear==size-1)
			return true;
		else
			return false;
	}
	public void enqueue(int data) {
		if(! isFull()) {
			rear++;
			arr[rear]=data;
		}else{
			System.out.println("Q is Full");
		}
	}
	public int dequeue() {
		int data=-9999;
		if(!isEmpty()) {
			front++;
			data=arr[front];
		}
		return data;
	}
	public void display() {
		System.out.println("<----");
		for(int i=front+1;i<=rear;i++) {
			System.out.println(" "+arr[i]);
		} 
		System.out.println("----->");
	}
}
