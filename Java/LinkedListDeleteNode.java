/*https://leetcode.com/problems/delete-node-in-a-linked-list*/

public class LinkedListDeleteNode {
	
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
	
	public static void delete(int value) {
		Node currentNode = head;
		if(head==null) {
			System.err.println("Empty List");
			return;
		}else {
			if(head.val == value) {
				head = head.next;
				return;
			}
			Node prev = null;
			while(currentNode!=null) {			
				if(currentNode.val == value) {
					if(currentNode==tail) {
						prev.next = null;
						tail = prev;
						return;
					}else {
						prev.next = currentNode.next;
						return;
					}				
				}
				prev = currentNode;
				currentNode=currentNode.next;
			}
		}
	}
	public static void main(String[] args) {
		
		LinkedListDeleteNode LinkedList = new LinkedListDeleteNode();
		LinkedList.insertNode(4);
		LinkedList.insertNode(5);
		LinkedList.insertNode(1);
		LinkedList.insertNode(9);
		System.out.print("Initial List : ");
		display();
		System.out.println("\nRemoving 5\n");
		delete(5);
		System.out.print("After Removal : ");
		display();
		
	}

}
