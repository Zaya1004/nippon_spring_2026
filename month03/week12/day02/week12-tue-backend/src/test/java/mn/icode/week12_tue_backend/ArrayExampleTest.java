package mn.icode.week12_tue_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayExampleTest {
     @Test
     void testArrayAdd() {
    	 ArrayExample arr = new ArrayExample();
    	 
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 0);
    	 
    	 arr.addNumber(1);
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 1);
    	 
    	 arr.addNumber(1);
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 2);
    	 
    	 arr.addNumber(1);
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 3);
    	 
    	 arr.addNumber(1);
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 4);
    	 
    	 arr.addNumber(1);
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 5);
    	 
    	 arr.addNumber(1);
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 6);
    	 
    	 arr.addNumber(1);
    	 assertEquals(arr.getLength(), 5);
    	 assertEquals(arr.getCurrentIndex(), 1);
     }
}
