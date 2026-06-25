package mn.icode.week12_wed_backend;

import java.util.ArrayList;

public class GradeBook {
	private ArrayList<Integer> grades = new ArrayList<>();

	void addGrade(int grade) {
		grades.add(grade);
	}

	double average() {
		if (grades.isEmpty())
			return 0;
		int sum = 0;
		for (int g : grades)
			sum += g;
		return (double) sum / grades.size();
	}

	int highest() {
//		if (grades.isEmpty()) {
//			return 0;
//		}
		int max = grades.get(0);
		for (int g : grades)
			if (g > max)
				max = g;
		return max;
	}

	int lowest() {
		if(grades.isEmpty()) {
			return 0;
		}
		int min = grades.get(0);
		for (int g : grades)
			if (g < min)
				min = g;
		return min;
	}

	int countAbove(int threshold) {
		int count = 0;
		for (int g : grades)
			if (g > threshold)
				count++;
		return count;
	}

	void showAll() {
		System.out.println("Дүнгүүд: ");
		for (int i = 0; i < grades.size(); i++) {
			System.out.println(grades.get(i));
			if (i < grades.size() - 1)
				System.out.println(", ");
		}

		System.out.println();
		System.out.printf("Дундаж: %.1f | Өндөр: %d | Бага: %d%n", average(), highest(), lowest());
	}
}
