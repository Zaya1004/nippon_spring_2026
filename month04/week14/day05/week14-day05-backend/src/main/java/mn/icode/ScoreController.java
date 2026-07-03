package mn.icode;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
	public record Score(int id, String name, int score, String program) {}
    public record CountResponse(int count) {}

    private final List<Score> scores = List.of(
            new Score(1, "Bataa", 82, "java"),
            new Score(2, "Saraa", 94, "web"),
            new Score(3, "Dorj", 58, "java"),
            new Score(4, "Naraa", 76, "web"),
            new Score(5, "Tuvshin", 67, "java")
    );
    
    // TODO 1:
    @GetMapping("/api/scores")
    public List<Score> allScores(){
    	return scores;
    }
    
    // TODO 2:
    @GetMapping("/count")
    public CountResponse countScore() {
    	return new CountResponse(scores.size());
    }
    
    // TODO 3:
    @GetMapping("/highest")
    public int highest() {
    	int highest = 0;
    	for (Score s : scores) {
    		if(highest < s.score) {
    			highest = s.score;
    		}
    	}
    	return highest;
    }
    
    // TODO 4:
    @GetMapping("search")
    public List<Score> searhByProgram(@RequestParam String program){
    	List<Score> matches = new ArrayList<>();
    	for (Score s : scores) {
    		if(s.program.equalsIgnoreCase(program)) {
    			matches.add(s);
    		}
    	}
    	return matches;
    }
}
