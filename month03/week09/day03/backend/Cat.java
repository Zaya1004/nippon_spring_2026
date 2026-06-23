public class Cat extends Animal {
    Cat(String name){
        super(name);
    }

    @Override
    void sound(){
        System.out.println(name + ": myauu!");
    }

    void eat(){
        System.out.println("hulgana idne.");
    }
}
