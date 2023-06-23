package leetCode;

import java.util.ArrayList;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("]")); // "[([]])"
	}

	public static boolean isValid(String s) {
		String openParentheses = "(";
		String openChaves = "{";
		String openBrackets = "[";
		String closeParentheses = ")";
		String closeChaves = "}";
		String closeBrackets = "]";

		char[] characters = s.toCharArray();

		ArrayList<String> existingOpeningsInCharacters = new ArrayList<>();

		for (int j = 0; j < characters.length; j++) {
			if (String.valueOf(characters[j]).equalsIgnoreCase(openParentheses)
					|| String.valueOf(characters[j]).equalsIgnoreCase(openChaves)
					|| String.valueOf(characters[j]).equalsIgnoreCase(openBrackets)) {
				existingOpeningsInCharacters.add(String.valueOf(characters[j]));
			} else {
				if (String.valueOf(characters[j]).equalsIgnoreCase(closeBrackets)) {
					if (existingOpeningsInCharacters.contains(openBrackets)) {
						checksIfItIsTheLastIndexAndRemovesIt(existingOpeningsInCharacters, openBrackets);
					} else {
						return false;
					}
				}

				if (String.valueOf(characters[j]).equalsIgnoreCase(closeChaves)) {
					if (existingOpeningsInCharacters.contains(openChaves)) {
						checksIfItIsTheLastIndexAndRemovesIt(existingOpeningsInCharacters, openChaves);
					} else {
						return false;
					}
				}

				if (String.valueOf(characters[j]).equalsIgnoreCase(closeParentheses)) {
					if (existingOpeningsInCharacters.contains(openParentheses)) {
						checksIfItIsTheLastIndexAndRemovesIt(existingOpeningsInCharacters, openParentheses);
					} else {
						return false;
					}
				}
			}
		}

		if (existingOpeningsInCharacters.isEmpty()) {
			return true;
		}

		return false;
	}

	public static void checksIfItIsTheLastIndexAndRemovesIt(ArrayList<String> existingOpeningsInCharacters,
			String characters) {
		if (existingOpeningsInCharacters.lastIndexOf(characters) == existingOpeningsInCharacters.size() - 1) {
			existingOpeningsInCharacters.remove(existingOpeningsInCharacters.size() - 1);
		}
	}
}