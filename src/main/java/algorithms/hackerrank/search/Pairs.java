package algorithms.hackerrank.search;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pairs {

	static int pairs = 0;;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers = scanner.nextInt();
		long diff = scanner.nextLong();
		Set<Long> numberSet = new HashSet<Long>();

		for(int i=0;i<numbers; i++) {
			numberSet.add(scanner.nextLong());
		}

		numberSet.forEach(K -> {
			if(numberSet.contains(K+diff))
				pairs++;
			});

		System.out.println(pairs);
		scanner.close();
	}

	

}
