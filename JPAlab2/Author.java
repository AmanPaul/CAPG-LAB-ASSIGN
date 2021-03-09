package JPAlab2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int ID;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Book> book;
	public Author() {
		
	}
	public Author(String name, List<Book> book) {
		super();
		this.name = name;
		this.book = book;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
}
