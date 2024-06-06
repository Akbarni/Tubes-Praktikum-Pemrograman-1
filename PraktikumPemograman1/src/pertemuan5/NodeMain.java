package pertemuan5;

public class NodeMain {
	public static void main(String[]args) {
		linkedlist list = new linkedlist();
		
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(1);
        
        System.out.println();
        list.display();
        
        
       list.removedMid(3);
      
       System.out.println();
       list.display();
	}

}
