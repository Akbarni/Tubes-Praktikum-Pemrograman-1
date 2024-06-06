package TubesFiks;

public class GraphMain {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        // Menambahkan cabang bank
        graph.addVertex("Cabang A");
        graph.addVertex("Cabang B");
        graph.addVertex("Cabang C");
        graph.addVertex("Cabang D");
        graph.addVertex("Cabang E");

        // Menambahkan jalur komunikasi antar cabang
        graph.addEdge(0, 1); // A-B
        graph.addEdge(0, 2); // A-C
        graph.addEdge(1, 3); // B-D
        graph.addEdge(2, 4); // C-E
        graph.addEdge(3, 4); // D-E

        // Menampilkan matriks ketetanggaan
        graph.adjacencyMatrix();
        System.out.println();

        // Menampilkan koneksi antar cabang
        graph.displayConnections();
    }
}
