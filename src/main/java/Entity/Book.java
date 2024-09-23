package Entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookset")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	

	private String name;
	private String description;
	private Integer yearofpublications;
	private String booktype; 
	
	public Book() {
		  
	 }
	public Book(Integer id, String name, String description, Integer yearofpublications, String booktype) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.yearofpublications = yearofpublications;
		this.booktype = booktype;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public Integer getyearofpublications() {
		return yearofpublications;
	}
	public void setyearofpublications(Integer yearofpublications) {
		this.yearofpublications = yearofpublications;
	}
	public String getbooktype() {
		return booktype;
	}
	public void setbooktype(String booktype) {
		this.booktype = booktype;
	}
 
}
