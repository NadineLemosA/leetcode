package leetCode;

import java.util.Stack;

public class ValidParenthesesWithStack {
	public static void main(String[] args) {
		System.out.println(isValid("([)]")); // test example;
	}

	public static boolean isValid(String s) {
		char openParentheses = '(';
		char openChaves = '{';
		char openBrackets = '[';
		char closeParentheses = ')';
		char closeChaves = '}';
		char closeBrackets = ']';

		char[] characters = s.toCharArray();

		Stack<Character> openings = new Stack<>();

		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == openParentheses || characters[i] == openChaves || characters[i] == openBrackets) {
				openings.push(characters[i]);
			} else {
				if (openings.isEmpty()) {
					return false;
				}

				if (characters[i] == closeParentheses) {
					if (openings.peek() == openParentheses) {
						openings.pop();
					} else {
						return false;
					}
				}

				if (characters[i] == closeChaves) {
					if (openings.peek() == openChaves) {
						openings.pop();
					} else {
						return false;
					}
				}

				if (characters[i] == closeBrackets) {
					if (openings.peek() == openBrackets) {
						openings.pop();
					} else {
						return false;
					}
				}
			}
		}

		if (openings.isEmpty()) {
			return true;
		}
		return false;
	}
}
