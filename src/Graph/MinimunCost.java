package Graph;

import java.util.ArrayList;
import java.util.List;

class Edges{
	
	int dest;
	int weight;
	
	Edges(int dest,int weight){
		this.dest=dest;
		this.weight=weight;
	}
	
	public String toString() {
		return "[" +"destination: "+ dest + " , "+"Weight: "+weight+"]";
	}
}

class Minimum_Cost_Path{
	
	List<List<Edges>> e;
	
	Minimum_Cost_Path(int v){
		e=new ArrayList<>();
		
		for(int i=0;i<v;i++) {
			e.add(new ArrayList<>());
		}
	}
	
	void AddEdge(int src,int dest,int weight) {
		e.get(src).add(new Edges(dest,weight));
		//e.get(dest).add(new Edges(src,weight));
	}
}
public class MinimunCost {

	public static void main(String[] args) {
		
		Minimum_Cost_Path v=new Minimum_Cost_Path(3);
		System.out.println(v.e.size());
		
		v.AddEdge(0, 1, 12);
		v.AddEdge(0, 2, 40);
		v.AddEdge(1, 2, 34);
		v.AddEdge(2, 3, 20);
		System.out.println(v.e);
	}

}
