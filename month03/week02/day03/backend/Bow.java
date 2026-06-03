public class Bow extends Weapons {
    int arrowCount;
    Bow(String name, int durability, int arrowCount){
        super(name, durability);
        this.arrowCount = arrowCount;
    }


    @Override
    int damage() {
        return arrowCount > 0 ? 25 : 0;
    }

    @Override
    void attack(String enemy){
       if (arrowCount <= 0) {
            System.out.println(name + ": Out of arrows!");
            return;
        }
        arrowCount--;
        super.attack(enemy);
    }

    @Override
    String getType(){
        return "Bow.";
    }
}
