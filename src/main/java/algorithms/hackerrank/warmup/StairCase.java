package algorithms.hackerrank.warmup;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for(int i=1; i<=input; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=1; j<=input; j++) {
				if(i<=(input-j)) {
					sb.append(' ');
				} else {
					sb.append('#');
				}
			}
			System.out.println(sb.toString());
		}
		scanner.close();
	}

}
