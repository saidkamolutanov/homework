package uz.library.day1.rep1;

public class Book {
    String title;
    String author;
    String isbn;
    int year;

    public Book(String title, String author, String id, int year){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("year: " + year);
        System.out.println("_______________________");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

}

