package algorithms.hackerrank.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] inputArray = new int[input];
		int index = 0;
		for(int i=0; i<inputArray.length; i++) {
			inputArray[index++] = scanner.nextInt();
		}

		int positingNumbers = 0;
		int negativeNumbers = 0;
		int zeros = 0;
		for(int i=0;i<inputArray.length; i++) {
			int number  = inputArray[i];
			if(number>0) {
				positingNumbers++;
			} else if (number<0) {
				negativeNumbers++;
			} else {
				zeros++;
			}
		}
		System.out.println((double)positingNumbers/input);
		System.out.println((double)negativeNumbers/input);
		System.out.println((double)zeros/input);
		scanner.close();
	}

}
