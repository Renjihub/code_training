
class Node{
	int key;
	Node left;
	Node right;
	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTreeToBinarySearchTree {
	Node root;
	int[] tree;
	int index = 0;
	public BinaryTreeToBinarySearchTree() {
		this.root = null;
	}
	void printInorder(Node node) {
		if(node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}
	
	void treetoArray(Node node) {
		if(node == null) {
			return;
		}
		treetoArray(node.left);
		tree[index] = node.key;
		index++;
		treetoArray(node.right);
	}
	
	int size(Node node) {
		if(node == null) {
			return 0;
		}else {
			return(size(node.left)+1+size(node.right));
		}
	}
	
	public Node bttoBST(Node node) {
		tree = new int[size(node)];
		treetoArray(node);
		Arrays.sort(tree);
		Node bst = constructBST(0,size(node)-1);
		return bst;
	}
	public Node constructBST(int start,int end) {
		if(start>end) {
			return null;
		}
		int middle = (start+end)/2;
		Node node = new Node(tree[middle]);
		
		node.left = constructBST(start, middle-1);
		node.right = constructBST(middle+1, end);
		return node;
	}
	public static void main(String[] args) {
		BinaryTreeToBinarySearchTree obj = new BinaryTreeToBinarySearchTree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.left = new Node(6);
		obj.root.right.right = new Node(7);
		System.out.println("Binary Tree(inorder)");
		obj.printInorder(obj.root);
		System.out.println("\nBinary Search Tree(inorder)");
		Node bst = obj.bttoBST(obj.root);
		obj.printInorder(bst);		
	}
	

}
