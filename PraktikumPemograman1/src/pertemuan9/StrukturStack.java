package pertemuan9;
public class StrukturStack {
    private int[] array; 
    private int capacity; 
    private int TOP; 
    public final int MIN = -1; 

    // Konstruktor untuk inisialisasi stack dengan kapasitas tertentu
    public StrukturStack(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        TOP = MIN; 
    }

    // Metode untuk menambahkan elemen ke dalam stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++; 
            array[TOP] = data; 
        }
    }

    // Metode untuk memeriksa apakah stack penuh
    boolean isFull() {
        return TOP == capacity - 1;
    }
    //apakah elemen stck kosong atau tidak
    
    public boolean isEmpty() {
    	return (TOP == MIN);
    }

	public boolean getSize() {
		return (TOP == MIN);
	}

	public boolean getTop() {
		return (TOP == MIN);
	}

	public void printElements() {		
	}
  
}
