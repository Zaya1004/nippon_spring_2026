public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void work(){
        System.out.println( "-d ajillaj baina.");
    }

    void getSalary(){
        System.out.println( " tsalintai.");
    }

    void introduce(){
        System.out.println("Ner: " + name + ". Nas: " + age);
        work();
        getSalary();
    }

    public static void main(String[] args) {
        Person[] persons = {
            new Employee("Zaya", 21, "IT company", 5000000)
        }; for (Person a : persons){
            a.introduce();
        }
    }
}
