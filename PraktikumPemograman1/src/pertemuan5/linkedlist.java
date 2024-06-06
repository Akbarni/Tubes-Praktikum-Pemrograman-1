package pertemuan5;

public class linkedlist {
    private Node head;

    public linkedlist() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.getNilai() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void removedMid(int e) {
        Node preNode = null;
        Node tempNode;
        boolean ketemu = false;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            tempNode = head;
            while (tempNode != null && !ketemu) {
                if (tempNode.getNilai() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                }
            }

            if (ketemu) {
                dispose(tempNode, preNode);
            } else {
                System.out.println("Elemen tidak ditemukan");
            }
        }
    }

    private void dispose(Node node, Node prevNode) {
        if (prevNode == null) {
            head = node.getNext();
        } else {
            prevNode.setNext(node.getNext());
        }
        node = null;
    }
}