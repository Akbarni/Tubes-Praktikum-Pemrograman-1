package TubesFiks;

class Graph {
    private Vertex vertexList[]; // Array simpul (vertex)
    private int adjMat[][]; // Matriks ketetanggaan
    private int nVerts; // Jumlah simpul saat ini

    public Graph(int maxVerts) { // Constructor
        vertexList = new Vertex[maxVerts];
        adjMat = new int[maxVerts][maxVerts];
        nVerts = 0;

        for (int i = 0; i < maxVerts; i++) // Set matriks ketetanggaan ke 0
            for (int j = 0; j < maxVerts; j++)
                adjMat[i][j] = 0;
    }

    public void addVertex(String label) { // Menambahkan cabang
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) { // Menambahkan jalur komunikasi
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) { // Menampilkan nama cabang
        System.out.print(vertexList[v].getLabel());
    }

    public void adjacencyMatrix() { // Menampilkan matriks ketetanggaan
        System.out.println("Matriks Ketetanggaan:");
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayConnections() { // Menampilkan koneksi antar cabang
        System.out.println("Koneksi antar cabang:");
        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].getLabel() + ": ");
            for (int j = 0; j < nVerts; j++) {
                if (adjMat[i][j] == 1) {
                    System.out.print(vertexList[j].getLabel() + " ");
                }
            }
            System.out.println();
        }
    }
}