package mn.icode.week12_wed_backend;

import java.util.ArrayList;

public class removeDuplicates {
	static ArrayList<String> removeDuplicates(ArrayList<String> list) {
		ArrayList<String> result = new ArrayList<>();
		for (String item : list) {
			if (!result.contains(item)) {
				result.add(item);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<>();
		input.add("a");
		input.add("b");
		input.add("a");
		input.add("c");
		input.add("b");
		input.add("d");

		System.out.println("Оролт:  " + input);
		System.out.println("Гаралт: " + removeDuplicates(input));
	}
}
