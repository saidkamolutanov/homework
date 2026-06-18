package uz.library.day1.rep1;

public class Book {
    String title;
    String author;
    String isbn;
    int year;

    public Book(String title, String author, String isbn, int year){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("year: " + year);
        System.out.println("__________________________");
    }
}

