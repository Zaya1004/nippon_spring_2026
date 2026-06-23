package nippon_spring_2026.month02.week08.day01.backend;
public class Student {
    String name;
    int age;
    double gpa;
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void printHello(){
        System.out.println("Hello Student");
    }

    void introduceMyself(){
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + "years old");
        System.out.println("I have a grade of " + gpa);
    }

    void nextYear(double gpa){
        System.out.println("Next year will be " + gpa + " Grade Student" );
    }

    String nextYear(){
        return "Next year I will be " + gpa + "student.";
    }
}
