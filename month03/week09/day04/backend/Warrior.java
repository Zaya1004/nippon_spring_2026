public class Warrior extends Character {
      int armor;
      Warrior(String name){
        super(name, 200, 5);
        this.armor = 10;
      }

      @Override
      void takeDamage(int dmg){
        int actual  = Math.max(1, dmg - armor);
        System.out.println(name + " хуяг " + (dmg - actual) + " хохирол сааруулав.");
        super.takeDamage(actual);
      }
      
      void shield(){
        armor += 5;
        System.out.println(name + " хамгаалалтаа нэмлээ. Хуяг: " + armor);
      }
}
