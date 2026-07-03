package mn.icode;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScorePageController {
	 @GetMapping(value = "/files/scores.txt", produces = MediaType.TEXT_PLAIN_VALUE)
	    public String scoresText() {
	        return """
	                Week 14 Scores
	                Passing score: 60
	                Highest score: 94
	                """;
	    }

	    @GetMapping(value = "/scores-page", produces = MediaType.TEXT_HTML_VALUE)
	    public String scoresPage() {
	        return """
	                <!DOCTYPE html>
	                <html>
	                <head><title>Week 14 Scores</title></head>
	                <body>
	                    <h1>Week 14 Scores</h1>
	                    <p>This HTML came from a Spring Boot controller.</p>
	                </body>
	                </html>
	                """;
	    }
}
