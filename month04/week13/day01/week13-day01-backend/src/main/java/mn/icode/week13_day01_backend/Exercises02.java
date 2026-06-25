package mn.icode.week13_day01_backend;

import java.util.HashMap;
import java.util.Map;

public class Exercises02 {
	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("Khangai", 44);
		people.put("Zaya", 21);
		people.put("Enji", 15);
		people.put("Saka", 23);
		people.put("Erkhes", 9);
		
		
		for(Map.Entry<String, Integer> entry: people.entrySet()){
	    	if(entry.getValue() > 20) {
	    		System.out.println(entry.getValue() + entry.getKey());
	    	}
		}
	}

}
