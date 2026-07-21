package mn.icode;

import java.util.ArrayList;

public class Student {
	String name;
	int age; 
	String course;
	int score;
	
    public Student(String name, int age, String course, int score) {
    	this.name = name;
    	this.age = age;
    	this.course = course;
    	this.score = score;
    }
    
    public boolean isPassing() {
    	return score >= 60;
    }
    
    public String getSummary() {
    	return name + " - " + course + " - " + score;
    }
    
    public static void main(String[] args) {
		Student s1 = new Student("Bataa", 18, "Java", 85);
		Student s2 = new Student("Saraa", 17, "JS", 72);
	    Student s3 = new Student("Tuvshin", 19, "Java", 48);	
	    
	    s1.getSummary();
	    s2.getSummary();
	    s3.getSummary();
	    
	    s1.isPassing();
	    s2.isPassing();
	    
	    
    }
    
    
}
