package mn.icode.week13_day01_backend;

import java.util.HashMap;

public class Exercises03 {
	public static void main(String[] args) {
		HashMap<String, Integer> score = new HashMap<String, Integer>();
		score.put("Zaya", 80);
		score.put("Enji", 90);
		score.put("Nora", 95);

		int total = 0;
		for (int scores : score.values()) {
			total += scores;
		}
		double average = (double) total / score.size();
		System.out.println("Дундаж: " + average);

		if (average >= 80) {
			System.out.println("Шалгуулаа!");
		} else {
			System.out.println("Дахин оролдоно.");
		}

	}
}
