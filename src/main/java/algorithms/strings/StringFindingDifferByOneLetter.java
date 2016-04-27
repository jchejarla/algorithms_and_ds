package algorithms.strings;

public class StringFindingDifferByOneLetter {
	
	public static void main(String[] args) {
		System.out.println(find(new String[] {"bababa","bana", "apple", "bonanza","banamf"},  "banana" ));
	}
	
	private static boolean find(String[] array, String name) {
		
		char[] charsInName = name.toCharArray();
		int length = name.length();
		int x = length/2;
		int y=length -x;
		for(String str : array) {
			
			if(str.length() != length) {
				continue;
			}
			
			char[] charsInString = str.toCharArray();
			int i=0; int j=length-1;
			
			while(i<x && j>=y){
				boolean found = false;
				if(charsInName[i] == charsInString[i]) {
					i++;
					found = true;
				}
				if(charsInName[j]==charsInString[j]) {
					j--;
					found=true;
				}
				if (!found) {
					break;
				}
			}
			
			if(i >= x || j<=y ) {
				return true;
			}
		}
		
		return false;
	}

}
