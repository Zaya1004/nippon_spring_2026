package mn.icode;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public record HelloResponse(String message, int week) {
	}

	@GetMapping(value = "/api/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String hello() {
		return "Hello World";

	}
// JSON - Javascript Object Notation
	
	@GetMapping(value = "/api/status", produces = MediaType.TEXT_PLAIN_VALUE)
	public HelloResponse status() {
		return new HelloResponse("Rest controlleris working", 14);
	}
}
