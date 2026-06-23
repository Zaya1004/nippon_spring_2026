public abstract class Weapons {
    String name; 
    int durability;
    Weapons(String name, int durability){
        this.name = name;
        this.durability = 10;
    }

    abstract int damage();
    abstract String getType();
    void attack(String enemy){
         System.out.println(name + " attacks enemy for X damage! Durability: Y");
    }

    boolean isBroken(){
        return durability <= 5;
    }

    void repair(){
        durability = 100;
    }

    void showStatus(){
        System.out.println(name + damage() + getType());
       
    }
}
