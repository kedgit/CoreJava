package practise;

import java.util.Scanner;

public class MatrixTranformation {

	public static void main(String[] args) {

//		int matrix[][]= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		
		// take input matrix
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of row: ");
		int row=sc.nextInt();
		System.out.println("Enter Number of columns: ");
		int col=sc.nextInt();
		
		// iterate and put elements in 2d array
		int mat[][]=new int [row][col];
		
		for(int i=0;i<row;i++) {
			System.out.println("Enter Elements for row: "+i);
			for(int j=0;j<col;j++) {
				System.out.println("Enter Elements for Position: "+i+" "+j);
				mat[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j< mat[i].length;j++) {
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
		
//		for(int i=0;i<matrix.length;i++) {
//			for(int j=0;j< matrix[i].length;j++) {
//				System.out.print(matrix[j][i]+" ");
//			}
//			System.out.println();
//		}

	}

}
