
public class Queue {
	  int size;
	  int rear;
	  int front;
	  int arr[];
       public Queue() {
    	   size=2;
    	   front=-1;
    	   rear=-1;
    	   arr=new int[size];
       }
           public Queue(int size) {
        	   this.size=size;
        	   front=-1;
        	   rear=-1;
        	   arr=new int[size];
           }
              
                 public boolean isempty() {
                	 if(front==-1)
                		 return true;
                	 else 
                	return false;
                 }
                   
                     public boolean isfull() {
                    	 return rear==size-1;
                     }
                        public void enqueue(int a) {
                        	if(!isfull()) {
                        		arr[++rear]=a;
                        		front=0;
                        	}else System.out.println("queue is full");
                        }
                            public int dequeue() {
                            	int data=-999;
                            	if(!isempty()) {
                            		data=arr[front];
                         
                            		if(front==rear) {front=rear=-1;}
                            		else front++;
                            		  return data;
                            		
                            	}else return data;
                            } 
                            public void display() {
                            	 {
                            		for(int i=front;i<=rear;i++) {
                            			System.out.println(arr[i]);
                            			
                            		}
                            	}
                            }
}
