package uz.library.day2.rep1;

public class Book {
    String title;
    String author;
    String isbn;
    int year;
    boolean isAvailable;

    public Book(String title, String author, String isbn, int year){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("year: " + year);
        System.out.println("isAvailable: " + isAvailable);
    }

    public void borrowBook() {
        if (isAvailable == true){
            isAvailable = false;
            System.out.println("Kitob olib ketildi !!!");
        }else {
            System.out.println("Kitob mavjud emas !!!");
        }
    }

    public void returnBook() {
        if (isAvailable == false){
            isAvailable = true;
            System.out.println("Kitob qaytarildi !!!");
        }else {
            System.out.println("Kitob allaqachon mavjud !!!");
        }
    }
}
