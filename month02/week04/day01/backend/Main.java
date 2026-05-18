public class Main {
    public static void main(String[] args) {
        System.out.println("Class and Objects");
        Human zaya = new Human();
        System.out.println(zaya.firstname); // dot notation
        System.out.println(zaya.lastname);
        System.out.println(zaya.gender);
        System.out.println(zaya.age);

        zaya.gender = "Em";
        zaya.firstname = "Sainzaya";
        zaya.lastname = "Shagdarsuren";

        System.out.println(zaya.firstname); // dot notation
        System.out.println(zaya.lastname);
        System.out.println(zaya.gender);
        System.out.println(zaya.age);

        Animal dog = new Animal();

        dog.age = 9;
        dog.gender = "Male";
        dog.race = "Mammalia";

        System.out.println(dog.age);
        System.out.println(dog.gender);
        System.out.println(dog.race);

        Child mychild = new Child("Zaya", 0);
        System.out.println(mychild.age);
        System.out.println(mychild.name);

        Student student = new Student("Zaya", 21, 4.0);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);

        student.printHello();
        student.introduceMyself();
        student.nextYear(4.0);
        System.out.println(student.nextYear());
    }
}
