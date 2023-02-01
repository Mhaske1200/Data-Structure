

import java.util.Scanner;

public class MyGraph {

	int v;
	int [][]arr;
	public MyGraph(int v) {
		this.v=v;
		arr=new int[v][v];
	}
	public void acceptGraph() {
		int i,j,data;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<v;i++) {
			for(j=0;j<v;j++) {
				System.out.println("Is" +i+"adjacent to "+j+"(1/0)");
				data=sc.nextInt();
				if(data==1 || data==0) {
					arr[i][j]=data;
				}
				else {
					System.out.println("Not valid option");
					break;
				}
			}
		}
	}
	public void displayGraph() {
		
		for(int i=0;i<v;i++) {
			System.out.println();
			for(int j=0;j<v;j++) {
				System.out.print(""+arr[i][j]);
			}
		}
	}
	public void DFS(int start)
	{
		int i,j,k=start;
		int []visited=new int[v];
		System.out.println("\n----DFS -------\n");
		System.out.print("  "+start);
		
		for( i=0;i<v;i++)
		{
			visited[start]=1;
			for(j=0;j<v;)
			{
				if(arr[k][j]==1 && visited[j]==0)	
				{
					System.out.print("  "+j);
					visited[j]=1;
					k=j;
				}
				else
					j++;
			}
		}
		System.out.println("\n-----------\n");
		
	}
	public void BFS(int start)
	{
		int i,j,k=start;
		int []visited=new int[v];
		MyQueue q=new MyQueue(v);
		q.enqueue(start);
		visited[start]=1;
		int ele;
		while(!q.isEmpty()) {
			ele=q.dequeue();
			System.out.println(" "+ele);
			for( i=0;i<v;i++)
			{
				if(arr[ele][i]==1 && visited[i]==0)	
				{
					q.enqueue(i);
					visited[i]=1;
				}
			}
		}
	
		System.out.println("\n-----------\n");
		
	}
}
