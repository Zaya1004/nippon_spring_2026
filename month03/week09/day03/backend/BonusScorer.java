public class BonusScorer extends Scorer{
    int base;
    int bonus;

    BonusScorer(String name, int base, int bonus){
        super(name);
        this.base = base;
        this.bonus = bonus;
    }

    @Override
    int getScore() {
       return base + bonus;        
    }
}
