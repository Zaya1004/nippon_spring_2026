public class Staff extends Weapons {
    int magicPower;
    Staff(String name, int durability, int magicPower){
        super(name, durability);
    }
    
    @Override
    int damage(){
        return magicPower * 3;
    }

    @Override
    String getType(){
        return "Magic Staff";
    }

}
