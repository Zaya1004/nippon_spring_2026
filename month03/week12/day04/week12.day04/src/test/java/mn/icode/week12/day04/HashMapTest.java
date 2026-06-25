package mn.icode.week12.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class HashMapTest {
    @Test
     public void testBasicPutAndGet() {
    	Map<String, Integer> studentGrades = new HashMap<String, Integer>();
    	Map<String, String> dictionaryMap = new HashMap<String, String>();
    	
    	studentGrades.put("Alice", 95);
    	studentGrades.put("Zaya", 100);
    	
    	
    	// retrieving data
    	
    	int aliceGrade = studentGrades.get("Alice");
    	
    	assertEquals(95, aliceGrade, "Alice's grade should be 95");
    	assertNull(studentGrades.get("Charlie"), "Charlies's grade is not included");
    }
    
    @Test
    public void testCheckExistence() {
    	Map<String, String> capitalCitiesMap = new HashMap<String, String>();
    	capitalCitiesMap.put("France", "Paris");
    	capitalCitiesMap.put("Japan", "Tokyo");
    	
    	assertTrue(capitalCitiesMap.containsKey("Japan"));
    	assertFalse(capitalCitiesMap.containsKey("German"));
    	
    	assertTrue(capitalCitiesMap.containsValue("Paris"));
    }
    
    @Test
    public void testRemoveItem() {
    	Map<Integer, String> employeeNames = new HashMap<Integer, String>();
    	
    	employeeNames.put(101, "Sarah");
    	employeeNames.put(102, "John");
    	
    	// remove employee 101
    	
    	String removeEmployee =  employeeNames.remove(101);
    	assertEquals("Sarah", removeEmployee);
    	assertFalse(employeeNames.containsKey(101));
    	assertEquals(1, employeeNames.size());
    }
    
    @Test
    public void testUpdateExistingValue() {
    	Map<String, Double> productPrices = new HashMap<String, Double>();
    	productPrices.put("Coffe", 3.99);
    	productPrices.put("Tea", 2.49);
    	
    	productPrices.put("Coffe", 4.50); // overwrites the 3.99
    	
    	assertEquals(4.50, productPrices.get("Coffe"));
    	assertEquals(2, productPrices.size());
    	
    	assertEquals(2.49, productPrices.get("Tea"));
    }
    
    @Test
    public void testSizeAndClear() {
    	Map<String, Integer> inventory = new HashMap<String, Integer>();
    	
    	inventory.put("Apples", 50);
    	inventory.put("Banana", 30);
    	inventory.put("Orange", 20);
    	
    	// Verify size
    	assertEquals(3, inventory.size());
    	assertFalse(inventory.isEmpty());
    	
    	
    	// Clear the map
    	inventory.clear();
    	
    	// Assertions after clearing
    	assertEquals(0, inventory.size());
    	assertTrue(inventory.isEmpty());
    }
    
    @Test
    public void testLoopingOverValuesToSum() {
    	Map<String, Integer> shoppingCart = new HashMap<String, Integer>();
    	shoppingCart.put("Apple", 2);
    	shoppingCart.put("Bread", 3);
    	shoppingCart.put("Milk", 4);

    	int totalCost = 0;
    	for (int price: shoppingCart.values()) {
    		totalCost += price;
    	}
    	
    	assertEquals(9, totalCost);
    }
    
    @Test
    private void testLoopingOverKeysToFindMatches() {
		Map<String, String> userRoles = new HashMap<String, String>();
		userRoles.put("alice_smith", "Admin");
		userRoles.put("bob_jones", "User");
		userRoles.put("charlie_smith", "User");
		
		int smithCount = 0;
		// Loop through just the keys
		for(String username: userRoles.keySet()) {
			if (username.endsWith("_smith")) {
				smithCount++;
			}
		}
		assertEquals(2, smithCount);
		
	}
    
    @Test
    private void testLoopingOverEntriesToFilterData() {
		Map<String, Integer> studenScores = new HashMap<String, Integer>();
		studenScores.put("Nora", 90);
		studenScores.put("Khishgee", 80);
		studenScores.put("Saka", 85);
		
		String topStudent = "";
		int highestScore = 0;
		// Loop through both keys and values at the same time
	    for(Map.Entry<String, Integer> entry: studenScores.entrySet()){
	    	if(entry.getValue() > highestScore) {
	    		highestScore = entry.getValue();
	    		topStudent = entry.getKey();
	    	}
	    }
	    
	    assertEquals("Nora", topStudent);
	    assertEquals(90, highestScore);
	}
}
