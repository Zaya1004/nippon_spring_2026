package mn.icode.week12_wed_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GradeBookTest {

	@Test
	public void testAdd() {
		GradeBook gradeBook = new GradeBook();
		assertEquals(gradeBook.average(), 0);
//		assertEquals(gradeBook.highest(), 0);
		assertEquals(gradeBook.lowest(), 0);
		assertEquals(gradeBook.countAbove(60), 0);

		gradeBook.addGrade(80);
		gradeBook.addGrade(90);

		assertEquals(gradeBook.average(), 85);
		assertEquals(gradeBook.highest(), 90);
		assertEquals(gradeBook.lowest(), 80);
		assertEquals(gradeBook.countAbove(60), 2);
		assertEquals(gradeBook.countAbove(85), 1);

		gradeBook.showAll();
	}
//	}
//   @Test
//   public void testGradeBook() {
//	   GradeBook grade = new GradeBook();
//	   
//	   grade.addGrade(1);
//	   
//	   assertEquals(grade.average(), 1);
//   }
}
