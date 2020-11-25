/*https://leetcode.com/problems/reverse-linked-list*/
public class LinkedListReversal {
	public static Node head;
	public static Node tail;
	
	class Node{
		int val;
		Node next;
		Node(){
			
		}
		Node(int val){
			this.val = val;
		}
		Node(int val,Node next){
			this.val = val;
			this.next = next;
		}
	}
	
	public  void insertNode(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public static void display() {
		Node currentNode = head;
		if(currentNode==null) {
			System.out.println("\nEmpty List");
		}
		while(currentNode!=null) {
			System.out.print("["+currentNode.val+"]");
			if(currentNode!=tail) {
				System.out.print("-->");
			}
			currentNode = currentNode.next;
		}
		System.out.println("");
	}
	public static void reverse(Node node) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current;    
            current = next;
            if(prev.val==head.val) {
            	tail=prev;
            }
        } 
		head = prev; 
	}
	public static void main(String[] args) {
		
		LinkedListReversal LinkedList = new LinkedListReversal();
		LinkedList.insertNode(4);
		LinkedList.insertNode(5);
		LinkedList.insertNode(1);
		LinkedList.insertNode(9);
		System.out.print("Sample List   : ");
		display();
		reverse(head);
		System.out.print("Reversed List : ");
		display();
		
	}

}
