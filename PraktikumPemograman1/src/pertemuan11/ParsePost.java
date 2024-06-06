package pertemuan11;
public class ParsePost {
	   private MyStack stack;
	   private String input;

	   public ParsePost(String input) {
		
	      this.input = input;
	   }

	   public int doParse() {
	      this.stack = new MyStack(20);

	      int hasilOps;
	      for(int i = 0; i < this.input.length(); ++i) {
	         char ch = this.input.charAt(i);
	         this.stack.displayStack(ch + " ");
	         if (ch >= '0' && ch <= '9') {
	            this.stack.push(ch - 48);
	         } else {
	            int bil2 = this.stack.pop();
	            int bil1 = this.stack.pop();
	            switch(ch) {
	            case '*':hasilOps = bil1 * bil2;break;
	            case '+':hasilOps = bil1 + bil2;break;
	            case ',':
	            case '.':
	            default:
	               hasilOps = 0;
	               break;
	            case '-':
	               hasilOps = bil1 - bil2;
	               break;
	            case '/':
	               hasilOps = bil1 / bil2;
	            }

	            this.stack.push(hasilOps);
	         }
	      }

	      hasilOps = this.stack.pop();
	      return hasilOps;
	   }
	}
