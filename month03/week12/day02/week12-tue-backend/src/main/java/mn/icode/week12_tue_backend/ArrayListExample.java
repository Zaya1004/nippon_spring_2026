package mn.icode.week12_tue_backend;

import java.util.ArrayList;

public class ArrayListExample {
    
	private ArrayList<String> friuts = new ArrayList<String>();
    
	public void addFruits() {
		friuts.add("Apple");
		friuts.add("Banana");
		friuts.add("Grapes");
		friuts.add("Kiwi");
		friuts.add("Orange");
		friuts.add(0, "Melon");
	}
	
	 public int getListLength() {
		 return friuts.size();
	 }
	 
	 public String getFriutsByIndex(int index) {
		 return friuts.get(index);
	 }
	 public boolean isFriutsExists(String friutName) {
		 return friuts.contains(friutName);
	 }
	 
	 public boolean isListEmpty() {
		 return friuts.isEmpty();
	 }
	 
	 public void changeFriut(String newFriut, int index) {
		 friuts.set(index, newFriut);
	 }
	 
	 public void deleteFriutByIndex(int index) {
		 friuts.remove(index);
	 }
}
