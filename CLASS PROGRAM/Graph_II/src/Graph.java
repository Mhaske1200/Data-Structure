import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	private int verices;
	Node head[];
	public Graph()
	{
		head=null;
	}
	public Graph(int vertices)
	{
		this.verices=vertices;
		head=new Node[vertices];
		for(int i=0;i<vertices;i++)
		{
			//now assume data int index from 0 to noofvertices
			head[i]=new Node(i,null); //paramterized constructure
			
		}
	}
	public void addNode(int sourse,int dest)
	{
		Node newnode1=new Node(sourse);
		Node newnode2=new Node(dest);
		Node move;
		if(head[sourse]==null)
		{
			head[sourse]=newnode2;
		}
		else
		{
			move=head[sourse];
			while(move.getNext()!=null)
				move=move.getNext();
			move.setNext(newnode2);
		}
		
		// If graph is Undirected Graph  then do following
		
		/*
		if(head[dest]==null)
		{
			head[dest]=newnode1;
		}
		else
		{
			move=head[dest];
			while(move.getNext()!=null)
				move=move.getNext();
			move.setNext(newnode1);
		}*/
			
	}
	 void TravDFS(int v, boolean visited[])
	    {
	        // Mark the current node as visited and print it
	        visited[v] = true;
	        System.out.print(v + " ");
	        Node move=head[v];
	        while (move!=null) 
	        {
	            int n = move.getData();
	            if (!visited[n])
	         
	            TravDFS(n, visited);
	        move=move.getNext();
	        }
	    }
	    public void DFS(int v)
	    {
	        boolean visited[] = new boolean[verices];
	  
	        TravDFS(v, visited);
	    }
	 
	public void PrintGraph()
	{
		Node move;
		
		for (int j = 0; j < verices; j++)
		{
			System.out.println("\n Adjacency list of vertex ");
			move=head[j];
			while(move!=null)
			{
				System.out.print(move.getData()+"-->");
				move=move.getNext();
			}
				
		}
	}
	 void BFS(int start)
	    {
	        boolean visited[] = new boolean[verices];
	        Node move;
	        // Create a queue for BFS
	        Queue<Integer> queue = new LinkedList<Integer>();
	 
	        // Mark the current node as visited and enqueue it
	        visited[start]=true;
	        queue.add(start);
	 
	        while (queue.isEmpty()== false)
	        {
	            // Dequeue a vertex from queue and print it
	            start = queue.remove();
	            System.out.print(start+" ");
	 
	            move=head[start];
	            while(move!=null)
	            {
	            	int n=move.getData();
	            	if(visited[n]==false)
	            	{
	            		visited[n]=true;
	            		queue.add(n);
	            	}
	            	move=move.getNext();
	            }
	          
	        }
	    }


}
