/*https://leetcode.com/problems/next-greater-node-in-linked-list  */
import java.util.Stack;

public class LinkedListNextGreater {
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
			if(currentNode!=tail && currentNode.next!=null) {
				System.out.print("-->");
			}
			currentNode = currentNode.next;
		}
		System.out.println("");
	}
	public Node nextGreater(Node currenthead) {
		Node currentNode = currenthead;
		if(currentNode == null) {
			return currentNode;
		}
		Node temp1 = new Node(-1);
		Node temp = temp1;
		
		currentNode = reverse(currentNode);
		Stack<Integer> stack = new Stack<>();
		while(currentNode!=null) {
			if(stack.empty()) {
				temp.next = new Node(0);
				stack.push(currentNode.val);
			}else {
				while(!stack.empty() && stack.peek()<=currentNode.val) {
					stack.pop();
				}
				if(stack.empty()) {
					temp.next = new Node(0);
					stack.push(currentNode.val);
				}else {
					temp.next=new Node(stack.peek());
					stack.push(currentNode.val);
				}
			}
			currentNode = currentNode.next;
			temp = temp.next;
		}
		temp = temp1;
		temp1 = temp1.next;
		temp1 = reverse(temp1);
		return temp1;
	}
		
	public  Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current;    
            current = next;
            if(prev==head) {
            	tail=prev;
            }
        }  
		return prev;
	}
	public static void main(String[] args) {
		LinkedListNextGreater LinkedList = new LinkedListNextGreater();
		System.out.println("Test Case : 1");
		LinkedList.insertNode(2);
		LinkedList.insertNode(1);
		LinkedList.insertNode(5);
		System.out.print("Input : ");
		display();
		head = LinkedList.nextGreater(head);
		System.out.print("Output : ");
		display();
		head = null;
		System.out.println("Test Case : 2");
		LinkedList.insertNode(2);
		LinkedList.insertNode(7);
		LinkedList.insertNode(4);
		LinkedList.insertNode(3);
		LinkedList.insertNode(5);
		System.out.print("Input : ");
		display();
		head = LinkedList.nextGreater(head);
		System.out.print("Output : ");
		display();
		head = null;
		System.out.println("Test Case : 3");
		LinkedList.insertNode(1);
		LinkedList.insertNode(7);
		LinkedList.insertNode(5);
		LinkedList.insertNode(1);
		LinkedList.insertNode(9);
		LinkedList.insertNode(2);
		LinkedList.insertNode(5);
		LinkedList.insertNode(1);
		System.out.print("Input : ");
		display();
		head = LinkedList.nextGreater(head);
		System.out.print("Output : ");
		display();
	}
}
