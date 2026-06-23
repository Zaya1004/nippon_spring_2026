public class Cats extends Animals{
    Cats(String name, int age){
        super(name, age);

    }


    @Override
    String sound() {
       return "Meow!";
    }

    @Override
    String getType() {
        return "Cat!";
    }
}
