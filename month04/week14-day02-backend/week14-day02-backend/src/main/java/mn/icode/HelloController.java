package mn.icode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public record HelloResponse(String message, int week) {
	}

	@GetMapping("/api/hello")
	public String hello() {
		return "Hello World";

	}
// JSON - Javascript Object Notation
	
	@GetMapping("/api/status")
	public HelloResponse status() {
		return new HelloResponse("Rest controlleris working", 14);
	}
}
