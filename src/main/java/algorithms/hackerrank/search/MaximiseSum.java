package algorithms.hackerrank.search;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * this can be solved with O(n2) using brute force algorithm.
 * 
 * basic modular arithmetic formula
 * 
 * (a+b)%M = (a%M + b%M) %M
 * (a-b)%M = (a%M - b%M) %M
 * 
 * we need to build prefix array using above formula
 * 
 */
public class MaximiseSum {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i=0; i<testCases; i++) {
			int arraySize = scanner.nextInt();
			long M = scanner.nextLong();
			long[] inputArray = new long[arraySize];
			for(int j=0; j<arraySize; j++) {
				inputArray[j] = scanner.nextLong();
			}
			printMaximiseSum(inputArray, M);
		}

		scanner.close();
	}
	
	private static void printMaximiseSum(long[] input, long M) {
		// lets build prefix array 
		long[] prefixArray = new long[input.length];
		long curr = 0;
		for(int i = 0; i < input.length; i ++) {
		  curr = (input[i] % M + curr% M) % M;
		  prefixArray[i] = curr;
		}
		
		// need to use TreeSet, because we need to remember indexes of elements after sorting
		TreeSet<Long> set = new TreeSet<Long>();
        long max = 0;
        for(long prefix: prefixArray) {
          if(set.isEmpty()) {
            max = prefix;
            set.add(prefix);
          } else {	
            max = Math.max(max, prefix);
            Long nextE = set.ceiling(prefix+1);
            if(nextE != null) 
            	max = Math.max(max, prefix - nextE + M);
            set.add(prefix);
          }
        }
        System.out.println(max);
	}
}
