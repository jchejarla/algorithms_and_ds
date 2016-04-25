package algorithms.hackerrank.search;

import java.util.Scanner;

public class LargestRegionInMatrix {
	
	private static int counter = 0;
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int mRows = scanner.nextInt();
		int nColumns = scanner.nextInt();
		int[][] matrix = new int[mRows][nColumns];
		for(int i=0 ;i <mRows; i++) {
			int[] matrixColumn = matrix[i];
			for( int j=0; j<nColumns; j++) {
				matrixColumn[j]  = scanner.nextInt();
			}
		}
		int[][] visited = new int[mRows][nColumns];
		
		int maxNum = 0;
		// 8 neighbors of a cell
		int rowNumArray[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
		int colNumArray[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
		for(int i=0 ;i <mRows; i++) {
			for( int j=0; j<nColumns; j++) {
				if (matrix[i][j]==1 && visited[i][j] !=1) {
					dfs(matrix,visited, i,j, mRows, nColumns, rowNumArray, colNumArray);
	                if(counter > maxNum) 
	                	maxNum = counter;  
	                counter = 0;  
                }
			}
		}
		System.out.println(maxNum);
		scanner.close();
	}
	private static void dfs(int[][] matrix, int[][] visited,int row, int column, int totalRows, int totalColumns, int[] rowNumArray,int[] colNumArray ) {

	    visited[row][column] = 1;
	    counter++;
		for(int adj=0;adj<8;adj++) {
			
			int tempRow = row+rowNumArray[adj];
			int tempColumn = column+colNumArray[adj];
			// safe check to avoid out of bounds
			if((tempRow >= 0) && (tempRow < totalRows) 
					&& (tempColumn >= 0) && (tempColumn < totalColumns) 
					&&(matrix[tempRow][tempColumn]==1 && visited[tempRow][tempColumn] !=1))
				
			dfs(matrix, visited, tempRow, tempColumn, totalRows, totalColumns, rowNumArray, colNumArray);
		}

	}

}
