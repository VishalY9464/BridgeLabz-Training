package com.libraryorganizer;

public class BookApp {
	
	 public static void main(String[] args) {

	        Library library = new Library();

	        library.addBook("Fiction", new Book(1, "1984", "George Orwell"));
	        library.addBook("Fiction", new Book(2, "Animal Farm", "George Orwell"));
	        library.addBook("Science", new Book(3, "Brief History of Time", "Stephen Hawking"));

	        library.displayCatalog();

	        library.borrowBook("Fiction", 2);

	        library.displayCatalog();
	    }

}
