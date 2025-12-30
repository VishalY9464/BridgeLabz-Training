//program for representing aggregation relationships in library and book
package com.objectmodeling;

import java.util.ArrayList;

// Book class
class Book {

    // attributes
    protected String title;
    protected String author;

    // constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Library class
class Library {

    // list to store books
    ArrayList<Book> bookList = new ArrayList<>();

    // method to add book
    public void addBook(Book book) {
        bookList.add(book);
    }

    // display all books
    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books available in the library:");
            for (Book book : bookList) {
                book.display();
                System.out.println("---------------------");
            }
        }
    }
}

// Main class
public class LibraryAndBook {

    public static void main(String[] args) {

        // create library object
        Library library = new Library();

        // create book objects
        Book b1 = new Book("Java Programming", "Vishal");
        Book b2 = new Book("Effective Java", "Vikash");

        // add books to library
        library.addBook(b1);
        library.addBook(b2);

        // display books
        library.displayBooks();
    }
}
