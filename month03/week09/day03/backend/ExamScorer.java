public class ExamScorer extends Scorer{
    int score;
    ExamScorer(String name, int score){
        super(name);
        this.score = score;
    }

    @Override
    int getScore() {
      return score;       
    }
}
