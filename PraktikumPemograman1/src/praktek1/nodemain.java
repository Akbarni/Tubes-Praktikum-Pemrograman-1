package praktek1;

public class nodemain {
	
	  public static void main(String[] args) {
	       
	        //membuat 2 buah node
	        node n1 = new node(5);
	        node n2 = new node(7);
	        node n3 = new node(9);
	        node n4 = new node(8);
	        node n5 = new node(2);
	        node n6 = new node(3);
	        
	        
	        // membuat relasi node n1 dan n2
	        n1.setnext(n2);
	        n2.setnext(n3);
	        n3.setnext(n4);
	        

	        //menampilkan node n1 dan n2 dengan pointer p
	        
	        node p = n1;
	        while(p != null)
	        {
	        System.out.printf("%d ", p.getnilai());
	        p = p.getnext();
	        }
	    }
	    
	}


