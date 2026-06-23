public class Character {
    String name;
    int hp, maxHp, level, attack;
    
    Character(String name, int maxHp, int attack){
        this.name = name;
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.level = 1;
        this.attack = attack;
    }

    void takeDamage(int dmg){
        hp = Math.max(0, hp - dmg);
    }

    void heal(int amount){
        hp = Math.min(maxHp, hp + amount);
        System.out.println(name + "" + amount + " HP сэргээлээ.  HP: " + hp + "/" + maxHp);
    }

    void levelUp(){
        level++;
        attack += 5;
        maxHp += 20;
        hp = maxHp;
        System.out.println(name + " level " + level + " болов!  ATK: " + attack + " HP: " + maxHp);
    }

    boolean isAlive(){
        return hp > 0;
    }

    void attackEnemy(Character enemy){
        System.out.println(name + " довтолж " + attack + " хохирол өгч байна. " );
        enemy.takeDamage(attack);
        System.out.println(enemy.name + " HP: " + enemy.hp + "/ " + enemy.maxHp);
    }

    void showStatus(){
        int bars = hp * 20 / maxHp;
        String bar = "#".repeat(bars) + "-".repeat(20 - bars);
        System.out.printf("[%s Lv%d] HP: %d/%d ATK:%d%n" , name, level, bar, hp, maxHp, attack);
    }

   
}
