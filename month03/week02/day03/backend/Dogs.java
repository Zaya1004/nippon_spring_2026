public class Dogs extends Animals{
    Dogs(String name, int age){
        super(name, age);
    }

    @Override
   String sound() {
      return "Woof!";
    }

    @Override
    String getType() {
        return "Dog!";
    }
    
}
