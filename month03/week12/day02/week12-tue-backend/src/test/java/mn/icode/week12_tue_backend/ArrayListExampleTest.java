package mn.icode.week12_tue_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArrayListExampleTest {
    @Test
    public void testArrayList() {
    	ArrayListExample  a = new ArrayListExample();
    	assertEquals(a.getListLength(), 0);
    	assertTrue(a.isListEmpty());
    	
    	a.addFruits();
    	assertEquals(a.getListLength(), 6);
    	
    	
    	a.addFruits();
    	assertEquals(a.getListLength(), 12);
    	
    	assertEquals(a.getFriutsByIndex(0), "Melon");
    	assertEquals(a.getFriutsByIndex(1), "Melon");
    	assertEquals(a.getFriutsByIndex(2), "Apple");
    	
    	
    	
    	assertTrue(a.isFriutsExists("Apple"));
    	assertFalse(a.isFriutsExists("Mango"));
    	
    	assertFalse(a.isListEmpty());
    	a.changeFriut("WaterMelon", 0);
    	
    	assertTrue(a.isFriutsExists("WaterMelon"));
    	
    	a.deleteFriutByIndex(0);
    	
    	assertEquals(a.getListLength(), 11);
    }
}
