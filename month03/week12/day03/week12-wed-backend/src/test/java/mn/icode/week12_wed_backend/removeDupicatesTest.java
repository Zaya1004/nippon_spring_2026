package mn.icode.week12_wed_backend;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

	ArrayList<String> removeDuplicates(ArrayList<String> list) {
		ArrayList<String> result = new ArrayList<>();
		for (String item : list) {
			if (!result.contains(item))
				result.add(item);
		}
		return result;
	}

	@Test
	void testRemoveDuplicates() {
		ArrayList<String> input = new ArrayList<>();
		for (String s : new String[] { "a", "b", "a", "c", "b", "d" })
			input.add(s);

		ArrayList<String> result = removeDuplicates(input);
		assertEquals(4, result.size());
	}

	@Test
	void testNoDuplicates() {
		ArrayList<String> input = new ArrayList<>();
		for (String s : new String[] { "x", "y", "z" })
			input.add(s);

		assertEquals(3, removeDuplicates(input).size());
	}

	@Test
	void testEmptyList() {
		ArrayList<String> input = new ArrayList<>();
		assertEquals(0, removeDuplicates(input).size());
	}

	@Test
	void testAllSame() {
		ArrayList<String> input = new ArrayList<>();
		for (String s : new String[] { "a", "a", "a" })
			input.add(s);

		assertEquals(1, removeDuplicates(input).size());
	}

	@Test
	void testPreservesOrder() {
		ArrayList<String> input = new ArrayList<>();
		for (String s : new String[] { "c", "b", "a", "b", "c" })
			input.add(s);

		ArrayList<String> result = removeDuplicates(input);
		assertEquals("c", result.get(0));
		assertEquals("b", result.get(1));
		assertEquals("a", result.get(2));
	}
}