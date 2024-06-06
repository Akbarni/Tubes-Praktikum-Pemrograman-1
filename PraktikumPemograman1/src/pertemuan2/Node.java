package pertemuan2;

public class Node {
	private int data;
	private Node next;
	private String nama;
	private static Node HEAD;
	
	/** Inisialisasi atribut node */
	public Node(int data) {
		this.data = data;
	}
	
	//setter
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	//getter
	public String getNama() {
		return nama;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
	
	public int getData() {
		return data;
	}
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	public void addTail(int data) {
		Node posNode = null, curNode=null;
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			HEAD = newNode;
		}else {
			curNode = HEAD;
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}
	
	public void displayElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}
	
	public void addHead(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	public static void main(String[] args) {
		Node list = new Node(0);

		list.addTail(1);
		list.addTail(4);
		list.addTail(5);
		list.addTail(7);
		
		System.out.println("\nElement memakai Tail: ");
		list.displayElement();
	}
}

