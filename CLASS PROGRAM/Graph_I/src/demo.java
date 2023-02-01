

public class demo {

	public static void main(String[] args) {
		MyGraph g=new MyGraph(4);
		g.acceptGraph();
		System.out.println("Graph is");
		g.displayGraph();
		g.DFS(0);
		g.BFS(0);
	}
}
