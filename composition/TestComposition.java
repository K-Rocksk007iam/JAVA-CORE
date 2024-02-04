package composition;

import java.util.*;

public class TestComposition {

	public static void main(String[] args) {
		// object of book
		Book book1 = new Book("JAVA", "S.K");
		Book book2 = new Book("C++", "C.K");
		Book book3 = new Book("PHP", "P.K");

		// adding object of book to a collection
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);

		// adding collection of books in library
		Library lab = new Library(books);

		// collection of books to display
		List<Book> bks = lab.getTotalBooksLibrary();

//		for (Book var : bks) {
//			System.out.println("TITLE IS :" + var.getTitle());
//			System.out.println("AUTHOR IS :" + var.getAuthor());
//			System.out.println("------------------------");
//
//		}

		for (int i = 0; i < bks.size(); i++) {
			System.out.println(bks.get(i));
		}

	}

}
