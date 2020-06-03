package data_structures_and_algorithm;

import java.util.HashMap;
import java.util.Stack;

public class BracketsLinterStack {

	public static void lint(String line) {
		Stack<Character> s = new Stack<>();

		Character[] openingBracket = new Character[] { '(', '{', '[' };
		Character[] closingBracket = new Character[] { ')', '}', ']' };

		HashMap<Character, Character> openingOf = new HashMap<>();
		HashMap<Character, Character> closingOf = new HashMap<>();

		for (int i = 0; i < openingBracket.length; i++) {
			openingOf.put(closingBracket[i], openingBracket[i]);
			closingOf.put(openingBracket[i], closingBracket[i]);
		}

		for (int i = 0; i < line.length(); i++) {
			if (openingOf.containsValue(line.charAt(i))) s.push(line.charAt(i));
			if (closingOf.containsValue(line.charAt(i))) {
				if (s.peek().equals(openingOf.get(line.charAt(i)))) {
					s.pop();
				} else {
					System.out.println("Error: closing bracket doesnt match for " + s.peek() + 
							"\nshould be : "+ closingOf.get(s.peek()) + 
							"\ninstead of: " + line.charAt(i));
					s.pop();
				}
			}
		}

		if (!s.isEmpty()) System.out.println("Error: " + s.peek() + " doesnt have closing");
	}

	public static void main(String[] args) {
		String line = "( var x = { y: [1, 2, 3] } )";
		lint(line);
	}

}
