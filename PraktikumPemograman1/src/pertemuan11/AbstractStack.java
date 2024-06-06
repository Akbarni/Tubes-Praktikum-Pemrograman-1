package pertemuan11;

public class AbstractStack {
	   protected int[] arr;
	   protected int capacity;
	   protected int TOP;
	   public final int MIN = -1;

	   public AbstractStack(int capacity) {
	      this.arr = new int[capacity];
	      this.capacity = capacity;
	      this.TOP = -1;
	   }

	   public void push(int data) {
	      if (!this.isFull()) {
	         ++this.TOP;
	         this.arr[this.TOP] = data;
	      } else {
	         System.out.println("Stack Penuh ... ");
	      }

	   }

	   public int pop() {
	      int data = -1;
	      if (!this.isEmpty()) {
	         --this.TOP;
	         data = this.arr[this.TOP + 1];
	      } else {
	         System.out.println("Stack Kosong ... ");
	      }

	      return data;
	   }

	   public boolean isFull() {
	      return this.TOP == this.capacity - 1;
	   }

	   public boolean isEmpty() {
	      return this.TOP == -1;
	   }

	   public int size() {
	      return this.TOP + 1;
	   }

	   public int top() {
	      return this.isEmpty() ? -1 : this.arr[this.TOP];
	   }

	   public String displayStack() {
	      String elemen = "";

	      for(int i = this.TOP; i > -1; --i) {
	         elemen = elemen + this.arr[i] + " ";
	      }

	      return elemen;
	   }
	}