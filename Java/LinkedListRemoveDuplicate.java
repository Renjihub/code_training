/*https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii*/

public class LinkedListRemoveDuplicate {
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
	public void removeDuplicates() {
		Node temp = new Node(0);  
		temp.next = head; 
	    Node prev = temp; 
	    Node current = head; 
	    while (current != null) 
	    { 
	        while (current.next != null && 
	               prev.next.val == current.next.val) 
	               current = current.next; 
	        if (prev.next == current) 
	            prev = prev.next; 
	        else
	            prev.next = current.next; 
	  
	        current = current.next; 
	    } 
	    head = temp.next;
	    }
	public static void main(String[] args) {
		LinkedListRemoveDuplicate LinkedList = new LinkedListRemoveDuplicate();
		LinkedList.insertNode(1);
		LinkedList.insertNode(2);
		LinkedList.insertNode(3);
		LinkedList.insertNode(3);
		LinkedList.insertNode(4);
		LinkedList.insertNode(4);
		LinkedList.insertNode(5);
		System.out.print("Sample List   : ");
		display();
		System.out.print("After Removel : ");
		LinkedList.removeDuplicates();
		display();
	}
}
