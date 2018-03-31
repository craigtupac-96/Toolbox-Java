/*
Author: Craig Lawlor
C00184465
Description: A program to use collections with A Book class
*/
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsExample {

	public static void main(String[] args) {	
		// Creating a collection of Books below
		Book book1 = new Book("Miss Peregrine's Home for Peculiar Children", "Ranson", "Riggs", 382);
		Book book2 = new Book("Harry Potter and the Philosophers Stone", "JK", "Rowling", 411);
		Book book3 = new Book("The Cat in the Hat", "Dr", "Seuss", 45);
		
		// use .collect to aggregate values
		List<Book> books = Arrays.asList(book1, book2, book3);
		int total = books.stream().collect(Collectors.summingInt(Book::getPages));
		System.out.println(total);
		
		// use .collect to aggregate author first names into a list
		// and .map to get the last name of the author
		List<String> list = books.stream().map(Book::getAuthorFName).collect(Collectors.toList());
		System.out.println(list);
		
		// Create a list with duplicates
		List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
		System.out.println("Before removing duplicates");
		System.out.println(dupBooks.toString());
		
		// Remove duplicates using a set
		Collection<Book> noDups = new HashSet<>(dupBooks);
		System.out.println("After removing duplicates");
		System.out.println(noDups.toString());
		
		// using a set to eliminate duplicates and sort automatically
		Set<Integer> numbers = new HashSet<>(Arrays.asList(4, 3, 3, 3, 2, 1, 1, 1));
		System.out.println(numbers.toString());
	}

}

class Book{
	private String title;
    private String authorFName;
    private String authorLName;
    private int pages;
  
    public Book(String title, String authorFName, String authorLName, int pages) {
        this.title = title;
        this.authorFName = authorFName;
        this.authorLName = authorLName;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFName() {
        return authorFName;
    }

    public void setAuthorFName(String authorFName) {
        this.authorFName = authorFName;
    }

    public String getAuthorLName() {
        return authorLName;
    }

    public void setAuthorLName(String authorLName) {
        this.authorLName = authorLName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public String toString() {
        return getTitle()+" Written By: "+getAuthorFName()+" " +getAuthorLName()+"\n";
    }
}