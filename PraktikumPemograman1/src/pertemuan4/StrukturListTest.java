package pertemuan4;

public class StrukturListTest {
     private Node head;

     
     
     
    public StrukturListTest() {
        this.head = null;
    }

    public void addHead(float nilai) {
        Node newNode = new Node(nilai);
        newNode.setNext(head);
        head = newNode;
    }

    public void addBottom(float nilai) {
        Node newNode = new Node(nilai);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public void addMiddle(float nilai, int posisi) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif");
            return;
        }

        if (posisi == 0 || head == null) {
            addHead(nilai);
            return;
        }

        Node newNode = new Node(nilai);
        Node current = head;
        int posisiSekarang = 0;

        while (posisiSekarang < posisi - 1 && current.getNext() != null) {
            current = current.getNext();
            posisiSekarang++;
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void tampilElemen() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getNilai() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StrukturListTest list = new StrukturListTest();

        list.addHead(7);
        list.addBottom(8);
        list.addMiddle(7, 2);
        list.addMiddle(6, 3);

        // Membuat node baru
        Node nodeBaru = new Node(9); // Mengisi value dengan 9
        Node nextNode = new Node(8); // Membuat node next dengan value 8
        nextNode.setNext(new Node(7)); // trus nanti abis 8 next nodenya 7
        nextNode.getNext().setNext(new Node(6)); // trus yg ini 6

        // Memastikan HEAD berisi data 9
        list.addHead(nodeBaru.getNilai());

        // Pengecekan setiap elemen node sampai menemukan posisi node yang dicari
        Node current = list.head;
        while (current != null && current.getNilai() != 7) {
            current = current.getNext();
        }

        // Menyisipkan node baru pada posisi tertentu
        if (current != null) {
            Node nextNodeBaru = new Node(3); // Membuat node next baru dengan value 3
            nextNodeBaru.setNext(current.getNext()); // Mengatur next node baru dengan next node current
            current.setNext(nextNodeBaru); // Mengatur next node current dengan node baru
        }

        // Menampilkan elemen list
        list.tampilElemen();
    }

    private static class Node {
        private float nilai;
        private Node next;

        public Node(float nilai) {
            this.nilai = nilai;
            this.next = null;
        }

        public float getNilai() {
            return nilai;
        }

        public void setNilai(float nilai) {
            this.nilai = nilai;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}