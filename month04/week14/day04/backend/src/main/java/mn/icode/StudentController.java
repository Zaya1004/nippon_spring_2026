package mn.icode;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

// PathVariable
// /api/students
@RestController
@RequestMapping("/api/students")
public class StudentController {
	// RequestParam
	private record Student(int id, String firstName, String lastName, String email, String major, int enrollmentYear,
			boolean isActive, int credits) {
	};

	private List<Student> students;

	public StudentController() {
		students = new ArrayList<>(List.of(
				new Student(1, "Alan", "Turing", "a.turing@university.com", "Computer Science", 2021, false, 120),
				new Student(2, "Ada", "Lovelace", "a.lovelace@university.com", "Mathematics", 2022, true, 95),
				new Student(3, "Grace", "Hopper", "g.hopper@university.com", "Systems Engineering", 2022, true, 110),
				new Student(4, "Margaret", "Hamilton", "m.hamilton@university", "Software Engineering", 2023, true, 45),
				new Student(5, "John", "Von Neumann", "j.vonneumann@university", "Physics", 2019, false, 135)));
	}

	// 1. /search?name=Saraa
	@GetMapping("/search")
	public List<Student> searchByName(@RequestParam String firstName) {
		List<Student> matches = new ArrayList<>();
		for (Student s : students) {
			if (s.firstName.equalsIgnoreCase(firstName)) {
				matches.add(s);
			}
		}
		return matches;
	}

	// 1.5 /search?name=Saraa&age=21
	@GetMapping("/search/advanced")
	public List<Student> searchByNameandMajor(@RequestParam String firstName, @RequestParam String major) {
		List<Student> matches = new ArrayList<>();
		for (Student s : students) {
			if (s.firstName.equalsIgnoreCase(firstName) && s.major.equalsIgnoreCase(major)) {
				matches.add(s);
			}
		}
		return matches;
	}

	// 2. /greet/{name}
	@GetMapping("/greet/{username}")
	public String greetStudent(@PathVariable String username) {
		return "Welcome to the class, " + username + "!";
	}

	// 3. /profile/{id}
	@GetMapping("/profile/{id}")
	public Student profileById(@PathVariable int id) {
		for (Student s : students) {
			if (s.id() == id) {
				return s;
			}
		}
		return null;
	}

}
