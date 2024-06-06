package pertemuan12;

public class Vertex {
		
		private char label; //label (e.g. 'A')
		private boolean wasVisited;
		
		public Vertex(char lab){ // constructor
			label = lab;
			wasVisited = false;
		}

 /** Setter dan Getter **/

public char getLabel() {
    return label;
}

public void setLabel(char label) {
    this.label = label;
}

public boolean wasVisited() {
    return wasVisited;
}

public void setVisited(boolean visited) {
    wasVisited = visited;
}
}