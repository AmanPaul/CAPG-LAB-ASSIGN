package JPAlab2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AuthorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("day2");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		/*
		 * tx.begin(); List<Book> li=new ArrayList<Book>(); li.add(new
		 * Book("Data Mining", 500)); Author a=new Author("Suraj", li); em.persist(a);
		 * tx.commit(); System.out.println("==========DONE=========");
		 */

		// 1st query
		Query q = em.createQuery("select b from Book b");
		List<Book> li = q.getResultList();
		for (Book b : li) {
			System.out.println(b.getISBN() + "\t" + b.getTitle());
		}
		// 2nd query
		Query q1 = em.createNativeQuery(
				"select * from book where isbn in(select book_isbn from author_book where author_id in(select id from author where name=:n))",
				Book.class);
		q1.setParameter("n", "Rahul");
		List<Book> li1 = q1.getResultList();
		for (Book b : li1) {
			System.out.println(b.getTitle());
			// 3rd query
			Query q2 = em.createNativeQuery("select * from book d where d.price between 1000 and 3600", Book.class);
			List<Book> li2 = q2.getResultList();
			for (Book d : li2)
				System.out.println(d.getISBN() + " " + d.getTitle());
			// 4th query
			Query q3 = em.createNativeQuery(
					"select * from author where ID in(select author_id from author_book where book_isbn=:n)",
					Author.class);
			q3.setParameter("n", 4);
			List<Author> li3 = q3.getResultList();
			for (Author a : li3) {
				System.out.println(a.getName());
			}
		}

	}
}
