package nippon_spring_2026.month03.week09.day01.backend;
public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void introduce(){
        System.out.println("I'm " + name + ". And " + age + "years old.");
    }

    void showInfo(){
        System.out.println("Ner: " + name + ", Nas: " + age);
    }
}
