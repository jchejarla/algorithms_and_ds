package algorithms.hackerrank.search;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PayingWithNumbers {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int inputsize = scanner.nextInt();
	        long[] input = new long[inputsize];
	        for (int i = 0; i < inputsize; i++) {
	            input[i] = scanner.nextLong();
	        }
	        // sort array
	        Arrays.sort(input);
	        long[] cumulativeSums = new long[inputsize];
	        cumulativeSums[0] = input[0];
	        for (int i = 1; i <= inputsize - 1; i++) {
	            cumulativeSums[i] = cumulativeSums[i - 1] + input[i];
	        }
	        int queriesSize = scanner.nextInt();
	        long sum = 0;
	        long cumuativeSumAtEnd = cumulativeSums[inputsize - 1];
	        PrintWriter pw = new PrintWriter(System.out);
	        for (int i = 0; i < queriesSize; i++) {
	            sum += scanner.nextLong();;
	            int position = binarySearch(input, -sum);
	            long result;
	            if (position > 0) {
	                long cumulativeSumAtPos = cumulativeSums[position - 1];
	                result = cumuativeSumAtEnd - 2*cumulativeSumAtPos + sum * inputsize - 2*sum * position;
	            }
	            else
	                result = (cumuativeSumAtEnd + sum * inputsize);
	            pw.append(result + "\n");
	        }
	        pw.flush();
	    }

	    private static int binarySearch(long[] array, long key) {
	        int low = 0;
	        int high = array.length - 1;

	        if(array[high] <key) {
	            return high+1;
	        }
	        if(key<array[low]) {
	            return 0;
	        }

	        while (low <= high) {
	            int mid = (low + high)/2;
	            long midVal = array[mid];

	            if (midVal < key) {
	                low = mid + 1;
	                if(key<array[mid+1]) {
	                    return mid+1;
	                }

	            } else if (midVal > key) {
	                high = mid - 1;
	            } else {
	                return mid;
	            }
	        }
	        return 0;
	    }
}
