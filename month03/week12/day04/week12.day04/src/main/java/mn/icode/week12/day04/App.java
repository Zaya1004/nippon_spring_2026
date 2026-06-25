package mn.icode.week12.day04;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<Integer> numberArrayList = new ArrayList<Integer>();

		// Add 5 number into the array list

		numberArrayList.add(1);
		numberArrayList.add(2);
		numberArrayList.add(3);
		numberArrayList.add(4);
		numberArrayList.add(5);

		// replace the number of 0-th index element with -100
		numberArrayList.set(0, -100);

		// Add 10 to index 3 of the array list
		numberArrayList.add(2, 10);

		// Delete the last element of the array list
		numberArrayList.remove(numberArrayList.size() - 1);

		// using loops to print out all the elements of the array list
		for (int i = 0; i < numberArrayList.size(); i++) {
			System.out.println(numberArrayList.get(i));
		}

	}
}
