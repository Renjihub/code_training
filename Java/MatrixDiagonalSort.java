/*
 * Given a m * n matrix matrix of integers, sort it diagonally in ascending order from the top-left to the 
 * bottom-right then return the sorted array*/

import java.util.Scanner;

public class MatrixDiagonalSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the matrix (row x column) :");
		int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the elements of matrix :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
		diagonalSort(mat);
	}
	
	public static void diagonalSort(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;	
		System.out.println("Sample Matrix is :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		//Diagonal Elements Sort
		for(int i=0;i<m;i++){
	    	for(int j=0;j<n;j++){
	    		for(int r=i+1,c=j+1; r<m && c<n;r++,c++){
	    			if(mat[i][j]> mat[r][c]){
	    				int temp=mat[i][j];
	    				mat[i][j]=mat[r][c];
	    				mat[r][c]=temp;
	    			}
	    		}
	    	}
	    }
		System.out.println("Sorted Array is :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
