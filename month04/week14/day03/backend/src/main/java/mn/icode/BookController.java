package mn.icode;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	public record Book(int id, String title, String author, int pages) {}
    public record TotalPagesResponse(int totalPages) {}

	private final List<Book> books = List.of(
			new Book(1, "Clean Code", "Robert Martin", 464),
			new Book(2, "Effective Java", "Joshua Bloch", 416), 
			new Book(3, "Java Basics", "Saraa", 220),
			new Book(4, "Spring Up", "Saraa", 310));

	@GetMapping("/api/books")
	public List<Book> allBooks() {
		return books;
	}

	
	@GetMapping( "/api/books/search")
	public ArrayList<Book> searchByAuthor(@RequestParam String author){
		ArrayList<Book> result = new ArrayList<Book>();
			for(Book book : books) {
				if(book.author.equals(author)) {
					result.add(book);
				}
			}  return result;
		     
	}
	
	@GetMapping("/api/books/longest")
	 public int longest() {
		int longest = 0;
		for (Book book : books) {
			if(longest < book.pages) {
				longest = book.pages;
			}
		}
		return longest;
	} 
 
	@GetMapping("/api/books/pages/total")
	public int totalPages() {
		int totalPages = 0;
		for(Book book : books) {
			 totalPages += book.pages;
		} 
		return totalPages;
	}
	
	
}
