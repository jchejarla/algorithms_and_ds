package algorithms.hackerrank.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		// first, build the array and then use this array for calculating sum
		// the reason why we are not doing sum while reading is because,
		//the sum function can move to a method as the input may come from a different source

		Scanner scanner = new Scanner(System.in);
		int inputSize = scanner.nextInt();
		int[] input  = new int[inputSize];
		for(int i=0; i<inputSize; i++) {
			input[i] = scanner.nextInt();
		}

		int sum = 0;
		for(int i=0; i<input.length; i++) {
			sum += input[i];
		}
		System.out.println(sum);
		scanner.close();
	}

}
