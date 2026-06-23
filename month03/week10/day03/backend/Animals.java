public abstract class Animals {
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String sound();

    abstract String getType();

    public void breath() {
        System.out.println(name + " is breathing.");
    }

    void showInfo() {
        System.out.println("Name: " + name + ". Age: " + age + getType());
        System.out.println("Sound: " + sound());
    }
}
