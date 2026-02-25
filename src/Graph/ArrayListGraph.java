package Graph;

import java.util.ArrayList;
import java.util.List;

class Matrixx{
	
	List<List<Integer>> edges;
	
	Matrixx(int count)
	{
		edges=new ArrayList<>();
		for(int i=0;i<count;i++) {
			edges.add(new ArrayList<>());
		}
	}
	
	void addEdges(int u,int v) {
		edges.get(u).add(v);
		edges.get(v).add(u);
	}
	
	void print() {
		for(int i=0;i<edges.size()-1;i++) {
			for(int f:edges.get(i)) {
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}
}
public class ArrayListGraph {

	public static void main(String[] args) {
		
	
		Matrixx mt=new Matrixx(4);
		
		mt.addEdges(0, 1);
		mt.addEdges(0, 2);
		mt.addEdges(1, 2);
		mt.addEdges(1, 3);
		mt.addEdges(2, 3);
		
		mt.print();

	}

}
