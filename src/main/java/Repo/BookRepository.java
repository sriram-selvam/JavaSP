package Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Entity.Book;


public interface BookRepository extends CrudRepository<Book, Integer> {

	public List<Book> findAllByyearofpublications(Integer yop);
	
	
	String rawQuery="select * from bookset";
	
	@Query(nativeQuery = true,value= rawQuery)
	public List<Book> getByRawQuery();
}
