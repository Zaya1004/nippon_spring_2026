package nippon_spring_2026.month03.week09.day01.backend;
public class GraduateStudent extends Student{
    String thesisTopic;

    GraduateStudent(String name, int age, String major, double gpa, String thesisTopic){
        super(name, age, major, gpa);
        this.thesisTopic = thesisTopic;
    }

    @Override
    void introduce(){
        System.out.println("\\n  Диссертаци: " + thesisTopic);
    }
}
