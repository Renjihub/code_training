/*https://leetcode.com/problems/insertion-sort-list/*/

public class LinkedListInsertionSort {
	public static Node head,sorted;
	public static Node tail,sorTail;
	
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
	public void insertionSort() {
		Node currentNode = head;
		Node next;
		while(currentNode!=null) {
			next = currentNode.next;
			SortedInsert(currentNode);
			currentNode = next;
		}
		Node tailNode =sorted;
		while(tailNode!=null) {
			if(tailNode.next==null) {
				tail = tailNode;
			}
			tailNode = tailNode.next;
		}
		head = sorted;
	}
	public static void SortedInsert(Node newNode) {
		if(sorted==null || sorted.val >=newNode.val) {
			newNode.next = sorted;
			sorted = newNode;
		}else {
			Node current = sorted;
			while(current.next!=null && current.next.val<newNode.val) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		

		
		
	}
	public static void main(String[] args) {
		LinkedListInsertionSort LinkedList = new LinkedListInsertionSort();
		LinkedList.insertNode(4);
		LinkedList.insertNode(2);
		LinkedList.insertNode(1);
		LinkedList.insertNode(3);
		System.out.print("Sample List   : ");
		display();
		System.out.print("Sorted Linked List : ");
		LinkedList.insertionSort();
		display();
		
	}

}
