package tree;

class EachNode{
	int data;
	EachNode left;
	EachNode right;
	
	EachNode(int data){
		this.data=data;
		left=right=null;
	}
}

class Root{
	
	EachNode root;
	
	EachNode insert(EachNode root,int data) {
		
		if(root==null) 
			return new EachNode(data);
		
		if(data<root.data)
			root.left=insert(root.left, data);
		
		else if (data>=root.data)
			root.right=insert(root.right, data);
		return root;
	}
	
	void inOrder(EachNode root) {
		if(root ==null) return;
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	

}
public class BSTree {

	public static void main(String[] args) {
	
		Root tree=new Root();
		
		int values[]= {12,25,13,23,23,63,17,29};
		
		for(int v:values) {
			tree.root=tree.insert(tree.root,v);
		}
		
		tree.inOrder(tree.root);
		
	}

}
