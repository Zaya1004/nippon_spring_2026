public class Parrot extends Animals{
    boolean canTalk;
    Parrot(String name, int age, boolean canTalk){
        super(name, age);
        this.canTalk = canTalk;
    }

    @Override
    String sound() {
      return canTalk ? "hello human" : "squawk";
    }

    @Override
    String getType() {
       return "parrot";
    }
}
