package com.constructor.levelone;

// Book class
class Book {

    public String ISBN;
    protected String title;
    private String author;

    // setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter
    public String getAuthor() {
        return author;
    }
}

// Child class
class EBook extends Book {

    EBook(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

// Main class
public class BookLibrarySystem {

    public static void main(String[] args) {

        EBook ebook = new EBook("ISBN12345", "Java Basics");

        ebook.display();

        ebook.setAuthor("James Gosling");
        System.out.println("Author: " + ebook.getAuthor());
    }
}
