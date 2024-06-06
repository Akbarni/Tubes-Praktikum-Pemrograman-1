package pertemuan7;
public class linkedlist {
    private Node HEAD;

    public linkedlist() {
        HEAD = null;
    }
    public boolean isEmpty() {
        return HEAD == null;
    }
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println(curNode.getData().getKode()+ " " + curNode.getData().getNama()+ ", " + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
    }

    // Metode lain untuk mengelola linked list
}
