public class Archer extends Character{
    int arrows;

    Archer(String name){
        super(name, 90, 20);
        this.arrows = 50;
    }

    void shoot(Character target){
        if (arrows < 2){
            System.out.println("Сум хүрэлцэхгүй!");
            return;
        }
        arrows -= 2;
        int dmg = (int)(attack * 1.5);
        System.out.println(name + " сум харваж " + dmg + " хохирол өгч байна. Сум: " + arrows);
        target.takeDamage(dmg);
    }

    @Override
    void showStatus(){
        super.showStatus();
        System.out.println(" Сум: " + arrows);
    }
}
