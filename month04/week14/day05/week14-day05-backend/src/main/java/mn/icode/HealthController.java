package mn.icode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	public record HealthResponse(String status, int week) {}
	
	@GetMapping("/api/health")
	public HealthResponse health() {
		return new HealthResponse("ok", 14);
	}
}
