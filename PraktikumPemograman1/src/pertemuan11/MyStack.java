package pertemuan11;

public class MyStack extends AbstractStack {
	   public MyStack(int capacity) {
	      super(capacity);
	   }

	   public void displayStack(String s) {
	      System.out.println(s);
	      System.out.println("Stack (bottm-->:");

	      for(int i = 0; i < this.size(); ++i) {
	         System.out.println(this.peekN(i));
	         System.out.println(' ');
	      }

	      System.out.println("");
	   }

	   public int peekN(int n) {
	      return this.arr[n];
	   }
	}