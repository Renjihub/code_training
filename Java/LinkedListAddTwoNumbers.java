/*https://leetcode.com/problems/add-two-numbers/ */

public class LinkedListAddTwoNumbers {
	
	public static ListNode head1=null,head2 = null,resHead=null,temp;
	public static ListNode tail1=null,tail2 = null,resTail=null;
	public static int carry = 0;
	public  class ListNode{
		int val;
		ListNode next;
		ListNode(){
			
		}
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
	}
	
	public  void insertNode(int value,int list) {
		ListNode newNode = new ListNode(value);
		if(list==1) {
			if(head1 == null) {
				head1 = newNode;
				tail1 = newNode;
			}else {
				tail1.next = newNode;
				tail1 = newNode;
			}
		}else if(list==2) {
			if(head2 == null) {
				head2 = newNode;
				tail2 = newNode;
			}else {
				tail2.next = newNode;
				tail2 = newNode;
			}
		}else if(list==3) {
			if(resHead == null) {
				resHead = newNode;
				resTail = newNode;
			}else {
				temp=resHead;
				resHead = newNode;
				resHead.next=temp;
			}
		}
		
	}
	public static void display(int list) {
		ListNode currentNode = null;
		if(list==1) {
			currentNode = head1;
			if(currentNode==null) {
				System.out.println("\nEmpty List");
				return;
			}
			while(currentNode!=null) {
				System.out.print("["+currentNode.val+"]");
				if(currentNode!=tail1) {
					System.out.print("-->");
				}
				currentNode = currentNode.next;
			}
			System.out.println("");
		}
		else if(list==2) {
			currentNode = head2;
			if(currentNode==null) {
				System.out.println("\nEmpty List");
			}
			while(currentNode!=null) {
				System.out.print("["+currentNode.val+"]");
				if(currentNode!=tail2) {
					System.out.print("-->");
				}
				currentNode = currentNode.next;
			}
			System.out.println("");
		}
		else if(list==3) {
			currentNode = resHead;
			if(currentNode==null) {
				System.out.println("\nEmpty List");
				return;
			}
			while(currentNode!=null) {
				System.out.print("["+currentNode.val+"]");
				if(currentNode!=resTail) {
					System.out.print("-->");
				}
				currentNode = currentNode.next;
			}
			System.out.println("");
		}

	}
	
	public void addLinkedList(ListNode listOne,ListNode listTwo) {
		if(listOne==null && listTwo==null) 
		{
			if(carry>0) {
				insertNode(carry, 3);
				return;
			}else {
				return;
			}
		}
		int val1=0;
		if(listOne!=null) {
			val1 = listOne.val;
			listOne = listOne.next;
		}
		int val2=0;
		if(listTwo!=null) {
			val2 = listTwo.val;
			listTwo = listTwo.next;
		}
		int sum = val1+val2+carry;
		carry = sum/10;
		sum = sum%10;
		addLinkedList(listOne,listTwo );
		insertNode(sum, 3);
		
	}
	
	public static void main(String[] args) {
		LinkedListAddTwoNumbers LinkedList = new LinkedListAddTwoNumbers();
		LinkedList.insertNode(2,1);
		LinkedList.insertNode(4,1);
		LinkedList.insertNode(3,1);
		
		LinkedList.insertNode(5,2);
		LinkedList.insertNode(6,2);
		LinkedList.insertNode(4,2);
		
		LinkedList.addLinkedList(head1, head2);
		System.out.println("Example 1 :");
		System.out.print("List 1   = ");
		display(1);
		System.out.print("List 2   = ");
		display(2);
		System.out.print("Solution = ");
		display(3);
		
		//Clear all list
		head1=head2=resHead=null;
		
		LinkedList.insertNode(0,1);
		
		LinkedList.insertNode(0,2);
		
		LinkedList.addLinkedList(head1, head2);
		System.out.println("Example 2 :");
		System.out.print("List 1   = ");
		display(1);
		System.out.print("List 2   = ");
		display(2);
		System.out.print("Solution = ");
		display(3);

		//Clear all list
		head1=head2=resHead=null;
		
		LinkedList.insertNode(9,1);
		LinkedList.insertNode(9,1);
		LinkedList.insertNode(9,1);
		LinkedList.insertNode(9,1);
		LinkedList.insertNode(9,1);
		LinkedList.insertNode(9,1);
		LinkedList.insertNode(9,1);
		
		LinkedList.insertNode(9,2);
		LinkedList.insertNode(9,2);
		LinkedList.insertNode(9,2);
		LinkedList.insertNode(9,2);
		
		LinkedList.addLinkedList(head1, head2);
		System.out.println("Example 2 :");
		System.out.print("List 1   = ");
		display(1);
		System.out.print("List 2   = ");
		display(2);
		System.out.print("Solution = ");
		display(3);
		
		
	}


}
