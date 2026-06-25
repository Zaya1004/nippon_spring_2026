package mn.icode.week13_day01_backend;

import java.util.ArrayList;

public class Exercises01 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] array = new int[10]; 
				
		for (int i = 0; i <= 10; i++) {
			numbers.add(i + 1);
		}

		System.out.println(numbers.get(5));

		numbers.remove(3);

		System.out.println(numbers.size());
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

	}
}
