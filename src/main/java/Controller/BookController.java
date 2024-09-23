package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import Entity.Book;
import Service.BookService;

@RestController
@RequestMapping("/Books")
public class BookController {

	@Autowired
	private BookService bookService;
	

	
	@GetMapping("/Books")
	public List<Book> getBooks(@RequestParam(value="yearofpublications", required= false) Integer yop)
	{
		
		return bookService.getBooks(yop);
	}
	
	@RequestMapping("/hello2")
    public String hi() {
		return "nanba";
	}

	@PostMapping("/insertingBooks")
	public String createBook(@RequestBody Book book) {
		bookService.insertBook(book);
		return "post iw working";
	}
	
	
	@GetMapping("/getOnebook/{id}")
	public Optional<Book> getBookById(@PathVariable Integer id)
	{
		return bookService.getBookById(id);
//		return null;
	}
	
	@DeleteMapping("/deletBook/{id}")
	public String deleteBook(@PathVariable Integer id)
	{
		
		String s=bookService.deleteBook(id);
		
			return "record delted suceessfully";
	}
	
	@PutMapping("/updateBook/{id}")
	public Book updateBooks(@RequestBody Book id) {
		return bookService.updateBook(id);
	}
	
	@GetMapping("/bookquery")
	public List<Book> getBooksByRawQuery()
	{
		return bookService.getBookByRawQueries();
	}

}
