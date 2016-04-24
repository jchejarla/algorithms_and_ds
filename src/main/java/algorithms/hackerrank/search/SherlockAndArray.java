package algorithms.hackerrank.search;

import java.util.Scanner;

public class SherlockAndArray {
	
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();
		
		for(int i=0;i<numberOfTestCases; i++) {
			int arrayLength = scanner.nextInt();
			int[] inputArray  = new int[arrayLength];
			for(int j=0;j<arrayLength; j++) {
				inputArray[j] = scanner.nextInt();
			}
			
			boolean isExists = checkIfElementSuchThatLeftAndRightArraysEqual(inputArray);
			System.out.println(isExists == true ? "YES" : "NO");
		}
		scanner.close();
	}
	
	private static boolean checkIfElementSuchThatLeftAndRightArraysEqual(int[] inputArray) {
		
		int leftIndex = 0;
		int rightIndex = inputArray.length -1;
		
		int leftSum = inputArray[leftIndex];
		int rightSum = inputArray[rightIndex];
		
		while(leftIndex != rightIndex && (rightIndex-leftIndex >=1)) {
			if(leftSum <rightSum) {
				leftSum += inputArray[++leftIndex];
			} else {
				rightSum += inputArray[--rightIndex];
			}
		}
		boolean result = (leftSum == rightSum);
		return result;
		
	}
}
