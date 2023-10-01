package leetCode;

public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
	}

	public static int romanToInt(String s) {

		char[] sequence = s.toCharArray();
		int convertedNumber = 0;
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] == 'M') {
				convertedNumber = convertedNumber + 1000;
			}

			if (sequence[i] == 'D') {
				convertedNumber = convertedNumber + 500;
			}

			if (sequence[i] == 'C') {
				if ((i + 1 < sequence.length) && (sequence[i + 1] == 'M')) {
					convertedNumber = convertedNumber + 900;
					i++;
				} else if ((i + 1 < sequence.length) && (sequence[i + 1] == 'D')) {
					convertedNumber = convertedNumber + 400;
					i++;
				} else {
					convertedNumber = convertedNumber + 100;
				}
			}

			if (sequence[i] == 'L') {
				convertedNumber = convertedNumber + 50;
			}

			if (sequence[i] == 'X') {
				if ((i + 1 < sequence.length) && (sequence[i + 1] == 'C')) {
					convertedNumber = convertedNumber + 90;
					i++;
				} else if ((i + 1 < sequence.length) && (sequence[i + 1] == 'L')) {
					convertedNumber = convertedNumber + 40;
					i++;
				} else {
					convertedNumber = convertedNumber + 10;
				}
			}

			if (sequence[i] == 'V') {
				convertedNumber = convertedNumber + 5;
			}

			if (sequence[i] == 'I') {
				if ((i + 1 < sequence.length) && (sequence[i + 1] == 'X')) { 
					convertedNumber = convertedNumber + 9;
					i++;
				} else if ((i + 1 < sequence.length) && (sequence[i + 1] == 'V')) {
					convertedNumber = convertedNumber + 4;
					i++;
				} else {
					convertedNumber = convertedNumber + 1;
				}
			}
		}
		return convertedNumber;
	}
}
