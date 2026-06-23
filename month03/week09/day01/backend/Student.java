package nippon_spring_2026.month03.week09.day01.backend;
public class Student extends Person {
    String major;
    double gpa;

    Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
    }

    public boolean isHonors() {
        return gpa >= 3.5;
    }

    @Override
    void introduce() {
        System.out.println(major + " mergejilten. " + " GPA: " + gpa);
    }
}
