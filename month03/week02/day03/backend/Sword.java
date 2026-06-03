public class Sword extends Weapons {
    double length;

    Sword(String name, int durability, double length) {
        super(name, durability);
        this.length = length;
    }

    @Override
    int damage() {
        return 30 + (int)(length * 5);
    }

    @Override
    String getType(){
        return "Sword.";
    }
}
