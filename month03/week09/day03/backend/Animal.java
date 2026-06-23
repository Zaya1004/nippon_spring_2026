public class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    void sound(){
        System.out.println(name + ": ...");
    }

    void eat(){
        System.out.println(name + " idne.");
    }
    

    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Sharga"),
            new Cat("Cat"),
            new Dog("Boro")
        };

        for (Animal a : animals){
            a.sound();
            a.eat();
        }
    }
}
