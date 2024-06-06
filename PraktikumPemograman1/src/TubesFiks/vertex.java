package TubesFiks;

class Vertex {
    private String label; // Nama cabang
    private boolean wasVisited;

    public Vertex(String label) { // Constructor
        this.label = label;
        this.wasVisited = false;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean wasVisited() {
        return wasVisited;
    }

    public void setVisited(boolean visited) {
        wasVisited = visited;
    }
}