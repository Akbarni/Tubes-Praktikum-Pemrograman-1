package TubesBank;

import java.util.*;

public class Graph {
    private Map<String, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Menambahkan node baru ke dalam graph
    public void addNode(String label) {
        if (!adjList.containsKey(label)) {
            adjList.put(label, new ArrayList<>());
            System.out.println("Node " + label + " berhasil ditambahkan.");
        } else {
            System.out.println("Node " + label + " sudah ada.");
        }
    }

    // Menghapus node dari graph
    public void removeNode(String label) {
        if (adjList.containsKey(label)) {
            adjList.values().forEach(e -> e.removeIf(edge -> edge.label.equals(label)));
            adjList.remove(label);
            System.out.println("Node " + label + " berhasil dihapus.");
        } else {
            System.out.println("Node " + label + " tidak ditemukan.");
        }
    }

    // Mengedit node dalam graph
    public void editNode(String oldLabel, String newLabel) {
        if (adjList.containsKey(oldLabel)) {
            List<Edge> edges = adjList.remove(oldLabel);
            adjList.put(newLabel, edges);
            for (List<Edge> edgeList : adjList.values()) {
                for (Edge edge : edgeList) {
                    if (edge.label.equals(oldLabel)) {
                        edge.label = newLabel;
                    }
                }
            }
            System.out.println("Node " + oldLabel + " berhasil diubah menjadi " + newLabel + ".");
        } else {
            System.out.println("Node " + oldLabel + " tidak ditemukan.");
        }
    }

    // Menambahkan edge antara dua node
    public void addEdge(String start, String end, int weight) {
        if (adjList.containsKey(start) && adjList.containsKey(end)) {
            adjList.get(start).add(new Edge(end, weight));
            adjList.get(end).add(new Edge(start, weight)); // Karena ini adalah graph tidak berarah
            System.out.println("Edge dari " + start + " ke " + end + " dengan berat " + weight + " berhasil ditambahkan.");
        } else {
            System.out.println("Salah satu atau kedua node tidak ditemukan.");
        }
    }

    // Menghapus edge antara dua node
    public void removeEdge(String start, String end) {
        if (adjList.containsKey(start) && adjList.containsKey(end)) {
            adjList.get(start).removeIf(edge -> edge.label.equals(end));
            adjList.get(end).removeIf(edge -> edge.label.equals(start));
            System.out.println("Edge antara " + start + " dan " + end + " berhasil dihapus.");
        } else {
            System.out.println("Salah satu atau kedua node tidak ditemukan.");
        }
    }

    // Mengedit edge antara dua node
    public void editEdge(String start, String end, int newWeight) {
        if (adjList.containsKey(start) && adjList.containsKey(end)) {
            for (Edge edge : adjList.get(start)) {
                if (edge.label.equals(end)) {
                    edge.weight = newWeight;
                }
            }
            for (Edge edge : adjList.get(end)) {
                if (edge.label.equals(start)) {
                    edge.weight = newWeight;
                }
            }
            System.out.println("Edge antara " + start + " dan " + end + " berhasil diubah dengan berat baru " + newWeight + ".");
        } else {
            System.out.println("Salah satu atau kedua node tidak ditemukan.");
        }
    }

    // Mencari rute terpendek antara dua node
    public List<String> shortestPath(String start, String end) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previousNodes = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        Set<String> visited = new HashSet<>();

        for (String node : adjList.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
            previousNodes.put(node, null);
        }

        distances.put(start, 0);
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            String currentLabel = currentNode.label;

            if (visited.contains(currentLabel)) continue;
            visited.add(currentLabel);

            for (Edge edge : adjList.get(currentLabel)) {
                String neighbor = edge.label;
                int newDist = distances.get(currentLabel) + edge.weight;

                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    previousNodes.put(neighbor, currentLabel);
                    pq.add(new Node(neighbor, newDist));
                }
            }
        }

        List<String> path = new LinkedList<>();
        for (String at = end; at != null; at = previousNodes.get(at)) {
            path.add(at);
        }

        Collections.reverse(path);
        return path;
    }

    // Menampilkan graph
    public void printGraph() {
        for (String node : adjList.keySet()) {
            System.out.print(node + " -> ");
            for (Edge edge : adjList.get(node)) {
                System.out.print(edge.label + "(" + edge.weight + ") ");
            }
            System.out.println();
        }
    }
}
