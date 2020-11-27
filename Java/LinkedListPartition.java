/*https://leetcode.com/problems/partition-list/*/
public class LinkedListPartition {
	
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
	public static void display(Node headNode,Node tailNode) {
		Node currentNode = headNode;
		if(currentNode==null) {
			System.out.println("\nEmpty List");
		}
		while(currentNode!=null) {
			System.out.print("["+currentNode.val+"]");
			if(currentNode!=tailNode) {
				System.out.print("-->");
			}
			currentNode = currentNode.next;
		}
		System.out.println("");
	}
	
	static Node[] partition(Node node, int x)  
	{  
	    Node smallerHead = null, smallerTail = null;  
	    Node greaterTail = null, greaterHead = null;  
	    Node equalHead = null, equalTail =null;  
	    Node[] result = new Node[2]; 
	    while (node != null)  {   
	        if (node.val == x) {  
	            if (equalHead == null)  
	                equalHead = equalTail = node;  
	            else {  
	                equalTail.next = node;  
	                equalTail = equalTail.next;  
	            }  
	        }else if (node.val < x)  {  
	            if (smallerHead == null)  {
	                smallerTail = node;
	                smallerHead = node;
	            }
	            else {  
	                smallerTail.next = node;  
	                smallerTail = node;  
	            }  
	        }  
	        else   {  
	            if (greaterHead == null) { 
	                greaterTail = node;
	                greaterHead = node;
	            }
	            else {  
	                greaterTail.next = node;  
	                greaterTail = node;  
	            }  
	        }  
	        node = node.next;  
	    }  
	   
	    if (greaterTail != null)  
	        greaterTail.next = null;  
	   
	    if (smallerHead == null)  
	    {  
	        if (equalHead == null) {
	        	result[0] = greaterHead;
	    	    result[1] = greaterTail;
	        	return result;
	        }
	             
	        equalTail.next = greaterHead; 
	        result[0] = equalHead;
		    result[1] = greaterTail;
	        return result;  
	    }   
	    if (equalHead == null)  
	    {  
	        smallerTail.next = greaterHead; 
	        result[0] = smallerHead;
		    result[1] = greaterTail;
	        return result;  
	    }    
	    smallerTail.next = equalHead;  
	    equalTail.next = greaterHead; 
	    result[0] = smallerHead;
	    result[1] = greaterTail;
	    return result;  
	} 
	
	public static void main(String[] args) {
		LinkedListPartition LinkedList = new LinkedListPartition();
		System.out.println("Test Case : 1");
		LinkedList.insertNode(1);
		LinkedList.insertNode(4);
		LinkedList.insertNode(3);
		LinkedList.insertNode(2);
		LinkedList.insertNode(5);
		LinkedList.insertNode(2);
		System.out.print("Node Elements : ");
		display(head,tail);
		int partitionKey = 3;
		System.out.println("Partition Key : "+partitionKey);
		Node result[] = partition(head, partitionKey);
		System.out.print("After Partition : ");
		display(result[0],result[1]);
		
	}

}