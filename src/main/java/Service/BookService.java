package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import Entity.Book;
import Repo.BookRepository;

@Service 
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public List<Book> getBooks(Integer yop)
	{
		List<Book> al= new ArrayList<>();
		if(yop==null) {
			bookRepo.findAll().forEach(book->al.add(book));
		}
		else {
			return bookRepo.findAllByyearofpublications(yop);
		}
		return al;
	}
	public Book insertBook(Book book) {
		return bookRepo.save(book);
		
	}
//	public String deleteBook(int id)
//	{
//		return bookRepo.deleteById(id);
//	}
	
	public Optional<Book> getBookById(Integer id)
	{
		return bookRepo.findById(id);
	}
	public String deleteBook(Integer id)
	{
		 bookRepo.deleteById(id);
		 return "sucess";
	}
	public Book updateBook(Book id) {
		// TODO Auto-generated method stub
	  return bookRepo.save(id);
	  }
	
//	public Book updateBook(Book id)
//	{
//		 return bookRepo.save(id);
//	}
	public List<Book> getBookByRawQueries() {
		return bookRepo.getByRawQuery();
	}
	
}

