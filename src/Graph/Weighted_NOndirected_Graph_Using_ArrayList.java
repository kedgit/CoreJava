package Graph;

import java.util.ArrayList;
import java.util.List;

// decide type of data contains by list

class Edge {
	int dest;
	int weight;
	
	 Edge(int dest,int weight){
		this.dest=dest;
		this.weight=weight;
	}
	public String toString() {
		return "[" +"destination: "+ dest + " , "+"Weight: "+weight+"]";
	}
}

public class Weighted_NOndirected_Graph_Using_ArrayList {
	
	// construcotr help to add innerlists
	
	private List <List<Edge>> eweight;
	int innerArrayList;
	// declare one Arraylist insided constructor and then take value from object and add number of inner arraylist.
	public Weighted_NOndirected_Graph_Using_ArrayList(int ver) 
	{
		this.innerArrayList=ver;
		eweight = new ArrayList<>();
		
		for(int i=0;i<innerArrayList;i++) {
			eweight.add(new ArrayList<>());
		}
	}
	
	// add edges inside innerlist by pass source , desti ,weight if need
	
	public void AddEdge(int src,int dest,int weight) {
		// if directed graph only
		eweight.get(src).add(new Edge(dest,weight));
		// if undirected then both
		eweight.get(dest).add(new Edge(src,weight));
		
	}
	
	// print graph
	
	void print() {
		
		for(int i=0;i<eweight.size();i+=1) {
			System.out.println(i+" "+"-->"+eweight.get(i));
		}
	}
	
	public static void main(String[] args) {

		Weighted_NOndirected_Graph_Using_ArrayList non=new Weighted_NOndirected_Graph_Using_ArrayList(5);
		non.AddEdge(0, 1, 7);
		non.AddEdge(0, 2, 8);
		non.AddEdge(1, 2, 5);
		non.AddEdge(2, 4, 10);
		non.AddEdge(1, 3, 12);
		non.AddEdge(4, 3, 17);
		
		non.print();
		
		

	}

}
