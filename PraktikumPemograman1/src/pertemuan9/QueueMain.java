package pertemuan9;

public class QueueMain {
    public static void main(String[] args) {
        // Membuat objek StrukturQueue
        StrukturQueue queue = new StrukturQueue();

        // Sebelum enqueue 3x
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());

        // Enqueue 3x
        System.out.println("### Enqueue 3x ###");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Setelah enqueue 3x
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Front: " + queue.front());
    }
}
