package algorithms.hackerrank.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // n*n matrix
		int[][] input = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				input[i][j] = scanner.nextInt();
			}
		}
		int primaryDiagonalDiff=0;
		int secondaryDiagonalDif=0;
		int primaryDiagonalIndex  = 0;
		int secondaryDiagonalIndex = input.length-1;
		for (int i = 0; i < input.length; i++) {
			int[] row = input[i];
			primaryDiagonalDiff += row[primaryDiagonalIndex++];
			secondaryDiagonalDif +=row[secondaryDiagonalIndex--];
		}
		int absoluteDiff = Math.abs(primaryDiagonalDiff-secondaryDiagonalDif);
		System.out.println(absoluteDiff);
		scanner.close();
	}

}
