package pertemuan9;

public class TestStrukturStack {
    public static void main(String[] args) {
        // Membuat objek stack dengan kapasitas 3 elemen
        StrukturStack stack = new StrukturStack(3);
        
        // Sebelum push
        System.out.println("Sebelum push:");
        System.out.println("Size: " + stack.getSize());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTop());
        System.out.print("Elemen from TOP: ");
        stack.printElements();
        System.out.println();
        
        // Melakukan push 3x: push 2; push 4, push 1
        stack.push(2);
        stack.push(4);
        stack.push(1);
        
        System.out.println("\nSetelah melakukan push 3x:");
        System.out.println("Size: " + stack.getSize());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTop());
        System.out.print("Elemen from TOP: ");
        stack.printElements();
    }
}

