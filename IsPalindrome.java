package leetCode;

public class IsPalindrome {

	public boolean isPalindrome(int x) {

		String valueForString = Integer.toString(x);
		char[] numbers = valueForString.toCharArray();

		String firstCombination = "";
		String lastCombination = "";
		
		for (int i = 0; i < numbers.length; i++) {
			firstCombination = firstCombination + String.valueOf(numbers[i]);
		}

		for (int i = numbers.length-1; i > -1; i--) {
			lastCombination = lastCombination + String.valueOf(numbers[i]);
		}
				
		if(lastCombination.equalsIgnoreCase(lastCombination)) {
			 return true;
		}
		
		return false;
		
//		return valueForString.equalsIgnoreCase(lastCombination);
	}
}
