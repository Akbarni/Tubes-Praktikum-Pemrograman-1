package pertemuan12;

public class GrapMain {
	
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		//menambahkan vertex
		graph.addVertex('A'); // 0 (star for dfs)
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		
		//menambahkan edge
		
		graph.addEdge(0, 1); //AB
		graph.addEdge(1, 0); //BA
		graph.addEdge(1, 3); //BD
		graph.addEdge(3, 1); //DB
		graph.addEdge(0, 3); //AD
		graph.addEdge(1, 3); //DA
		graph.addEdge(0, 2); //AC
		graph.addEdge(2, 0); //CA
		graph.adjacencyMatrix();
		System.out.println();
	}

}
