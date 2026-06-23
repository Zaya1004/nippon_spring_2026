public class Scorer {
    String name;

    Scorer(String name){
        this.name = name;
    }
    
    int getScore(){
       return 0;
    }

    void showResult(){
        System.out.println("[" + name + ": " + getScore() + " score.]");
    }

    public static void main(String[] args) {
        Scorer[] scorers = {
            new ExamScorer("Nora", 9),
            new BonusScorer("Saka", 7, 3)
        };
        for (Scorer s : scorers){
            s.showResult();
        }
    }
}
