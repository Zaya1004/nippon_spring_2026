public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Employee("Zaya", 21, "IT company", 5000000)
        };
        for (Person a : persons) {
            a.introduce();
        }

        System.out.println("========================");
        A[] as = {
                new B(9, 7),
                new C(9, 7, 6)
        };
        for (A a : as) {
            a.show();
        }
        System.out.println();
        System.out.println("========================");

        Food[] foods = {
                new Friut("Apple", 95, true),
                new FastFood("Fries", 500, "L"),
                new Vegetable("Banana", 110, true)
        };
        for (Food f : foods) {
            f.describe();
        }

        System.out.println("========================");

        Character[] characters = {
                new Warrior("Zora"),
                new Mage("Witch"),
                new Archer("Jade")
        };
        for (Character c : characters) {
            c.takeDamage(10);
            c.levelUp();
            c.showStatus();
        }
    }
}
