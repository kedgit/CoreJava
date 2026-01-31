package tree;

// basic structure of tree
class Node{
	int data;
	Node left=null;
	Node right=null;
	
	Node(int value){
		this.data=value;
		left=right=null;
	}
}

 class FirstTreeNode {
	
	// root object
	Node root;
	
	// initialise root object to null means start of tree building with root node and it is null before o
	FirstTreeNode(){
		root=null;
	}
	
	void inorder_travel(Node node) {
		if(node!=null) {
			inorder_travel(node.left);
			System.out.print(node.data+" ");
			inorder_travel(node.right);
		}
		
	}
	
	void postorder_Travel(Node node) {
		if(node!=null) {
			postorder_Travel(node.left);
			postorder_Travel(node.right);
			System.out.print(node.data+" ");
			
		}
		
	}
	void preorder_Travel(Node node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			preorder_Travel(node.left);
			preorder_Travel(node.right);
		}
	}
 }
 
 public class SimpleTree {
	
	public static void main(String[] args) {
		
		FirstTreeNode tree=new FirstTreeNode();   // constructor get call newly start building tree with first node as root and null data
		tree.root=new Node(1);             // object create of node class from structure on tree node and assign to root node of tree
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.inorder_travel(tree.root);   // call to print tree by passing first/root node in inorder  left --> root--> right
		System.out.println();
		tree.postorder_Travel(tree.root);  // call to print tree by passing root node in post oreder   left --> right --> root
		System.out.println();
		tree.preorder_Travel(tree.root);   // call to print tree by passing root node in pre oreder   root --> left --> right
	}

}
