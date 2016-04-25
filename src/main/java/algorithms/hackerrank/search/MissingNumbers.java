package algorithms.hackerrank.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MissingNumbers {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aListSize = scanner.nextInt();
		Map<Long, Integer> aValues = new HashMap<>();
		
		for(int i=0; i<aListSize; i++) {
			long value = scanner.nextLong();
			Integer count = aValues.get(value);
			if(count == null) {
				count = 1;
			} else {
				count +=1;
			}
			aValues.put(value, count);
		}
		
		int bListSize = scanner.nextInt();
		Map<Long, Integer> bValues = new HashMap<>();
		
		for(int i=0; i<bListSize; i++) {
			long value = scanner.nextLong();
			Integer count = bValues.get(value);
			if(count == null) {
				count = 1;
			} else {
				count +=1;
			}
			bValues.put(value, count);
		}
		
		// separating functional logic from input logic 
		
		bValues.forEach((key, value) -> {
						Integer countFromAObj = aValues.get(key);
						int countFromA = 0;
						if(countFromAObj !=null) {
							countFromA = countFromAObj.intValue();
						}
						if(countFromA < value.intValue()) {
							System.out.print(key + " ");
						}
					});
		
		scanner.close();
	}

}
