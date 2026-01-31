package Graph;

public class Nondireted_Graph_Using_matrix {
	// declarations 
	private int vert;
	private int [][] matrix;
	int count=0;
	
	// initialization
	public Nondireted_Graph_Using_matrix(int vertices) {
		this.vert=vertices;
		matrix=new int [vert][vert];
	}
	private void Addedge(int u,int v) {
		
		matrix[u][v]=1; // single direction / directed graph
	//	matrix[v][u]=1;  // both / undireted grap
	}
	
	public void print() {
		// iterate matrix row
		for(int i=1;i<vert;i++) {
			// iterate matrix column 
			for(int j=1;j<vert;j++) {
				System.out.print(matrix[i][j]+" ");
				if(matrix[i][j]==1)
					count++;
			}
			// new row /line
			System.out.println();
		}
		System.out.println("Number of Edges:"+count);
	}
	public static void main(String[] args) {
		Nondireted_Graph_Using_matrix root=new Nondireted_Graph_Using_matrix(6);
		
		root.Addedge(0, 1);
		root.Addedge(0, 2);
		root.Addedge(1, 3);
		root.Addedge(2, 4);
		root.Addedge(4, 3);
		root.Addedge(2, 5);
		
		
		root.print();
	}

}
