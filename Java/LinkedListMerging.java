/*https://leetcode.com/problems/merge-two-sorted-lists*/

public class LinkedListMerging {
	

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
	
	public void mergeLinkedList(ListNode listOne,ListNode listTwo) {
		int mergeValue = 0;
		if(listOne==null&& listTwo==null) {return;}
		while(listOne!=null && listTwo!=null) {
		
			if(listOne.val<listTwo.val) {
				insertNode(listOne.val, 3);
				listOne=listOne.next;
			}else if(listOne.val>listTwo.val) {
				insertNode(listTwo.val, 3);
				listTwo=listTwo.next;
			}else {
				insertNode(listOne.val, 3);
				insertNode(listTwo.val, 3);
				listOne=listOne.next;
				listTwo=listTwo.next;
			}
		}
		
	}
	public void reverse(ListNode node) {
		ListNode prev = null;
		ListNode current = resHead;
		ListNode next = null;
		while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current;    
            current = next;
            if(prev==resHead) {
            	resTail=prev;
            }
        } 
		resHead = prev; 
	}

	
	public static void main(String[] args) {
		LinkedListMerging LinkedList = new LinkedListMerging();
		LinkedList.insertNode(1,1);
		LinkedList.insertNode(2,1);
		LinkedList.insertNode(4,1);
		
		LinkedList.insertNode(1,2);
		LinkedList.insertNode(3,2);
		LinkedList.insertNode(4,2);
		
		LinkedList.mergeLinkedList(head1, head2);
		LinkedList.reverse(resHead);
		
		System.out.println("Example 1 :");
		System.out.print("List 1   = ");
		display(1);
		System.out.print("List 2   = ");
		display(2);
		System.out.print("Solution = ");
		display(3);
		
	}




}
