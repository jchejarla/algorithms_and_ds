package algorithms.hackerrank.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlourSumInArray {
	
	public static void main(String[] args) {
	
		Scanner scanner  = new Scanner(System.in);
		int noOfTestCases = scanner.nextInt();
		for(int i=0; i<noOfTestCases; i++) {
			int money = scanner.nextInt();
			int noOfFlavours = scanner.nextInt();
			int[] costArray = new int[noOfFlavours];
			for(int j=0; j<noOfFlavours; j++) {
				costArray[j] = scanner.nextInt();
			}
			
			//number and its index
			Map<Integer, Integer> numbertoIndexMap = new HashMap<Integer, Integer>();
			for(int j=0; j<costArray.length; j++) {
				int costDiff = money-costArray[j];
				Integer pairedCostElementIndex = numbertoIndexMap.get(costDiff);
				if(pairedCostElementIndex != null) {
					System.out.println(""+pairedCostElementIndex + " " + (j+1));
				} else {
					numbertoIndexMap.put(costArray[j],j+1);
				}
			}
		}
		scanner.close();
	}

}
