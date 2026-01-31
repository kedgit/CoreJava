package tree;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	
	Node1(int value){
		this.data=value;
		left=null;
		right=null;
	}
	
	@Override
    public String toString() {
        return "Node1 data: " + data;
    }
	
}

public class TreeNode {

	Node1 root;
	TreeNode(){
		root=null;
	}
	
	static void inorder(Node1 node) {
		if(node!=null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	
	static int maxDepth(Node1 node) {
		if(node==null) {
			return 0;
		}
		
		int left=maxDepth(node.left);
		int right=maxDepth(node.right);
		
		return 1+ Math.max(left,right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree=new TreeNode();
		tree.root=new Node1(11);
		tree.root.left=new Node1(12);
		tree.root.left.left=new Node1(14);
		tree.root.left.right=new Node1(15);
		tree.root.right=new Node1(13);
		
		inorder(tree.root);
		System.out.println("Max Depth Of The Tree: ");
		int depth=maxDepth(tree.root);
		System.out.println(depth);
		
		
	}

}
