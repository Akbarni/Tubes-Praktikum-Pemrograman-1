package TubesBank;

import java.util.List;

public class BankingGraph {
    public static void main(String[] args) {
        Graph bankGraph = new Graph();

        // Menambahkan cabang bank dan ATM
        bankGraph.addNode("ATM1");
        bankGraph.addNode("ATM2");
        bankGraph.addNode("Branch1");
        bankGraph.addNode("Branch2");
        bankGraph.addNode("Branch3");

        // Menghubungkan cabang bank dan ATM dengan jarak tertentu
        bankGraph.addEdge("ATM1", "Branch1", 5);
        bankGraph.addEdge("ATM1", "Branch2", 10);
        bankGraph.addEdge("ATM2", "Branch1", 15);
        bankGraph.addEdge("Branch1", "Branch2", 20);
        bankGraph.addEdge("Branch2", "Branch3", 25);

        // Menampilkan graph
        bankGraph.printGraph();

        // Mengedit node
        bankGraph.editNode("Branch3", "Branch3_new");

        // Mengedit edge
        bankGraph.editEdge("Branch2", "Branch3_new", 30);

        // Mencari rute terpendek antara ATM1 dan Branch3_new
        List<String> path = bankGraph.shortestPath("ATM1", "Branch3_new");
        System.out.println("Shortest path from ATM1 to Branch3_new: " + path);

        // Menghapus node
        bankGraph.removeNode("ATM2");

        // Menghapus edge
        bankGraph.removeEdge("Branch1", "Branch2");

        // Menampilkan graph
        bankGraph.printGraph();
    }
}
