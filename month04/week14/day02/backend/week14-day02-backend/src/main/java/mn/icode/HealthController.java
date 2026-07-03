package mn.icode;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HealthController {
	@GetMapping(value = "/api/health", produces = MediaType.TEXT_PLAIN_VALUE)
     public String health() {
    	 return """
    	 		Week 14 is running
    	 		""";
    			 
     }
	
	@GetMapping(value = "/files/about.txt", produces = MediaType.TEXT_PLAIN_VALUE)
	public String about() {
		return """
				This text came from a Spring Boot controller.
				""";
	}
	
	@GetMapping(value = "/controller-page", produces = MediaType.TEXT_HTML_VALUE)
	public String page() {
		return """
				<!DOCTYPE html>
                <html>
                <head>
                    <title>Controller Page</title>
                    <link rel="stylesheet" href="/controller-style.css">
                </head>
                <body>
                    <h1>Hello from a REST Controller</h1>
                    <p>This HTML came from a Java method.</p>
                    <button onclick="showMessage()">Click</button>
                    <script src="/controller-app.js"></script>
                </body>
                </html>
				""";
	}
	
	@GetMapping(value = "/controller-style.css", produces = "text/css")
	public String style() {
		return """
				body {
                    font-family: Arial, sans-serif;
                    margin: 40px;
                    background: #f5f7fb;
                }

                h1 {
                    color: red;
                }

                button {
                    padding: 10px 16px;
                    border: 0;
                    background: #1f4e79;
                    color: pink;
                }
				""";
	}
	
}
