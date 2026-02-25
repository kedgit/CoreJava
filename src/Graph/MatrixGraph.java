package Graph;


class Matrix{
	int edge;
	int [][]matrix;
	Matrix(int vert){
		this.edge=vert;
		matrix=new int[edge][edge];
	}
	
	void addEdge(int u,int v) {
		matrix[u][v]=1;
	}
	
	void print() {
		for(int i=1;i<edge;i++) {
			for(int j=1;j<edge;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class MatrixGraph {

	public static void main(String[] args) {
		
		Matrix mg=new Matrix(5);
		
		mg.addEdge(1, 1);
		mg.addEdge(2, 2);
		mg.addEdge(3, 3);
		mg.addEdge(4, 4);
		
		mg.print();

	}

}
