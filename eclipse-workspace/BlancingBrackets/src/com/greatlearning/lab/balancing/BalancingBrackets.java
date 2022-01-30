package com.greatlearning.lab.balancing;

import java.util.Stack;

public class BalancingBrackets {

	static boolean checkingBracketsBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++) {

			char ch = expression.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {

				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {
				return false;

				char c;

				switch (ch) {

				case '}':

					c = stack.pop();
					if (c == '(' || c == '[')
						return false;
					break;

				case ')':
					c = stack.pop();
					if (c == '{' || c == '[')
						return false;
					break;

				case ']':
					c = stack.pop();
					if (c == '(' || c == '{')
						return false;
					break;

				}
			}

			return stack.isEmpty();
		}

	}

	// Driver code

	public static void main(String[] args) {
		String expression = "([[{}]])";

		boolean result;

		result = checkingBracketsBalanced(expression);

		if (result)
			System.out.println("The entered string has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Blanced Brackets");
	}

}
