/*https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/*/

public class LinkedListBinarytoInteger {
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
	public int binaryToDecimal(Node binaryList) {
		int digit=0;
		Node cur = head;
		String binaryString = "";
		while(cur!=null){
			binaryString = binaryString+Integer.toString(cur.val);
			cur=cur.next;
		}
		digit = Integer.parseInt(binaryString,2); 
		return digit;
	}
	public static void main(String[] args) {
		LinkedListBinarytoInteger LinkedList = new LinkedListBinarytoInteger();
		int decimal = 0;
		System.out.println("Test Case : 1");
		LinkedList.insertNode(1);
		LinkedList.insertNode(0);
		LinkedList.insertNode(1);
		System.out.print("List with binary value   : ");
		display();
		decimal = LinkedList.binaryToDecimal(head);
		System.out.println("Decimal Value : "+decimal);
		head = null;
		System.out.println("Test Case : 2");
		LinkedList.insertNode(0);
		System.out.print("List with binary value   : ");
		display();
		decimal = LinkedList.binaryToDecimal(head);
		System.out.println("Decimal Value : "+decimal);
		head = null;
		System.out.println("Test Case : 3");
		LinkedList.insertNode(1);
		System.out.print("List with binary value   : ");
		display();
		decimal = LinkedList.binaryToDecimal(head);
		System.out.println("Decimal Value : "+decimal);
		head = null;
		System.out.println("Test Case : 4");
		LinkedList.insertNode(1);
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		LinkedList.insertNode(1);
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		LinkedList.insertNode(1);
		LinkedList.insertNode(1);
		LinkedList.insertNode(1);
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		System.out.print("List with binary value   : ");
		display();
		decimal = LinkedList.binaryToDecimal(head);
		System.out.println("Decimal Value : "+decimal);
		head = null;
		System.out.println("Test Case : 5");
		LinkedList.insertNode(0);
		LinkedList.insertNode(0);
		System.out.print("List with binary value   : ");
		display();
		decimal = LinkedList.binaryToDecimal(head);
		System.out.println("Decimal Value : "+decimal);
	}
}
