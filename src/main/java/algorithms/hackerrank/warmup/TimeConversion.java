package algorithms.hackerrank.warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String time = scanner.next();
		char[] timeChars = time.toCharArray(); // using chars ass String is
												// immutable and any change will
												// create new String
		// time format will be aa:bb:ccAM/PM, so AM or Pm indication will be 9th and 10th characters
		char[] militaryTime = new char[8];
		militaryTime[2] = ':';
		militaryTime[5] = ':';
		char hourToken1 = timeChars[0];
		char hourToken2 = timeChars[1];
		char minToken1 = timeChars[3];
		char minToken2 = timeChars[4];
		char secondsToken1 = timeChars[6];
		char secondsToken2 = timeChars[7];
		if (timeChars[8] == 'A') {
			if (timeChars[0] == '1' && timeChars[1] == '2') {
				hourToken1 = '0';
				hourToken2 = '0';
			}
		} else if (timeChars[8] == 'P') {
			if (!(timeChars[0] == '1' && timeChars[1] == '2')) {
				hourToken1 = (char) (timeChars[0] + '1' - 48);
				hourToken2 = (char) (timeChars[1] + '2' - 48);
			}

		}
		String result = appendTime(militaryTime, hourToken1, hourToken2, minToken1, minToken2, secondsToken1,
				secondsToken2);
		System.out.println(result);
		scanner.close();
	}

	private static String appendTime(char[] timeChars, char hourToken1, char hourToken2,
			char minToken1, char minToken2, char secondsToken1, char secondsToken2) {
		timeChars[0] = hourToken1;
		timeChars[1] = hourToken2;
		timeChars[3] = minToken1;
		timeChars[4] = minToken2;
		timeChars[6] = secondsToken1;
		timeChars[7] = secondsToken2;
		return String.valueOf(timeChars);
	}
}
