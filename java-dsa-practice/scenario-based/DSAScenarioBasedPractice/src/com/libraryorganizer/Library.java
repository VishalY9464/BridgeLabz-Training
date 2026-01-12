package com.libraryorganizer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Library {
	
	private HashMap<String, LinkedList<Book>>catalog=new HashMap<>();
	
	HashSet<Book> bookIds=new HashSet<>();
	
	
    public void addBook(String genre, Book book) {

        // check duplicate
        if (bookIds.contains(book.id)) {
            System.out.println("Book already exists!");
            return;
        }

        // get or create genre list
        catalog.putIfAbsent(genre, new LinkedList<>());

        // add book
        catalog.get(genre).add(book);
        bookIds.add(book);

        System.out.println("Book added successfully.");
    }
    
    public void borrowBook(String genre, int bookId) {
    	LinkedList<Book>books=catalog.get(genre);
    	
    	if(books==null) {
    		System.out.println("Genre not found");
    		return;
    	}
    	
    	Iterator<Book>iterator=books.iterator();
    	
    	while(iterator.hasNext()) {
    		Book b=iterator.next();
    		
    		if(b.id==bookId) {
    			iterator.remove();
    			bookIds.remove(bookId);
    			System.out.println("Book Borrowed");
    			return;
    		}
    	}
    	System.out.println("Book not found");
    }
    
    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(book);
            }
        }
    }
}



