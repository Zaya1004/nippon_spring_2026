public class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    @Override
    void sound(){
        System.out.println(name + ": how how!");
    }
    
    void eat(){
        System.out.println("ys idne.");
    }
}
