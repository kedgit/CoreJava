package Graph;
import java.util.List;
import java.util.ArrayList;


public class NOndirected_Graph_Using_ArrayList {

	// declare List as List of Integers (interface)
	 private  List <List<Integer>> adjList;
	 
	 // constructor
	public NOndirected_Graph_Using_ArrayList(int ver) {
		//assign new arraylist (implement class arraylist)
		adjList=new ArrayList<>();
		
		// add number of arraylist into main arraylist
		for(int i=0;i<ver;i++) {
			adjList.add(new ArrayList<>());
		}
		
	}
	
	// method addedge()
	
	public void Addedge(int u,int v) {
		// take first index and add element 
		adjList.get(u).add(v);  // for directed graph only
		adjList.get(v).add(u);	// both for undirected graph 
	}

	// print graph
	
	public void print() {
		for(int i=0;i<adjList.size()-1;i++) {
			System.out.print("Connected vertices to "+ i +" are: "+" --> ");
			for(int neighbor:adjList.get(i)) {
				System.out.print(neighbor+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		NOndirected_Graph_Using_ArrayList root=new NOndirected_Graph_Using_ArrayList(4);
		root.Addedge(0, 1);
		root.Addedge(0, 2);
		root.Addedge(1, 3);
		root.Addedge(1, 2);
		root.Addedge(2, 3);
		root.print();
	}

}
