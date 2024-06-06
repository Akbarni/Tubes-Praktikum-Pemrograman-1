package pertemuan9;

public class StrukturQueue {
    private Node FRONT;
    private Node REAR;

    public StrukturQueue() {
        FRONT = null;
        REAR = null;
    }
   

    public boolean isEmpty() {
        return FRONT == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

   
}
