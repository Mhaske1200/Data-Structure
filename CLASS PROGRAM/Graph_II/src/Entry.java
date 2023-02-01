//import org.graalvm.compiler.nodes.calc.AddNode;

public class Entry {
	public static void main(String[] args) {
		
		Graph g=new Graph(4);
		g.addNode(0, 1);
		g.addNode(0, 2);
		g.addNode(1, 2);
		g.addNode(2, 0);
		g.addNode(2, 3);
		g.addNode(3, 3);
		
		
		
		g.PrintGraph();
		System.out.println("\n DFS Is :(starting With 0 ");
		g.DFS(2);
		System.out.println();
		System.out.println("\n BFS Is  (Starting With 2 ): ");
		g.BFS(2);
		System.out.println();
	}

}
