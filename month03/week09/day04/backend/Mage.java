public class Mage extends Character{
    int mana;
    Mage(String name){
        super(name, 200, 5);
        this.mana = 100;
    }
    
    void castSpell(Character target){
        if (mana < 20) {
            System.out.println("Мана хүрэлцэхгүй!");
            return;
        } 
        mana -=20;
        int dmg = attack * 2;
        System.out.println(name + " ид шид хэрэглэж " + dmg + " хохирол өгч байна! Мана: " + mana);
        target.takeDamage(dmg);
    }

    @Override
    void levelUp(){
        super.levelUp();
        mana += 10;
        System.out.println("  Мана: " + mana);
    }
}
