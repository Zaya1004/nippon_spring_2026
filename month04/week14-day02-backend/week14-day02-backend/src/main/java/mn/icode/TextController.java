package mn.icode;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TextController {
 
	
	@GetMapping(value = "/files/readme.txt", produces = MediaType.TEXT_PLAIN_VALUE)
 public String readMe() {
	 return """
	 		Week 14 Readme
	 		Topic: FIrst Rest Controller
	 		
	 		""";
 }
 
}
