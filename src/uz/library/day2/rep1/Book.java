package uz.library.day2.rep1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
    private boolean isAvailable;

    public Book (String title, String author, String isbn, int year){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.isAvailable = isAvailable();
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        if (title != null && title.trim().isEmpty()){
            this.title = title;
        }else {
            System.out.println("Invalid titlr");
        }
    }

    public void setAuthor(String author) {
        if (author != null && author.trim().isEmpty()){
            this.author = author;
        }else {
            System.out.println("Invalid author");
        }
    }

    public void setIsbn(String isbn) {
        if (isbn != null && isbn.trim().isEmpty()){
            this.isbn = isbn;
        }else {
            System.out.println("Invalid isbn");
        }
    }

    public void setYear(int year) {
        if (year > 0){
            this.year = year;
        }else {
            System.out.println("Invalid year");
        }
    }

    public void borrowBook() {
        if (isAvailable){
            isAvailable = false;

        }
        System.out.println("Book is already borrowed");
    }

    public void returnBook() {
        if (isAvailable){
            isAvailable = true;
        }
        System.out.println("Book is already available");
    }

    public void displayInfo() {
        System.out.println("____________________________");
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("year: " + year);
        System.out.println("isAvailable: " + isAvailable);
        System.out.println("____________________________");
    }
}
