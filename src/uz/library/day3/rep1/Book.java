package uz.library.day3.rep1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.isAvailable = isAvailable;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean borrowBook() {
        if (isAvailable){
            isAvailable = true;
            return true;
        }
        System.out.println("Book is already borrowed");
        return false;
    }

    public boolean returnBook() {
        if (isAvailable){
            isAvailable = true;
            return true;
        }
        System.out.println("Book is available");
        return false;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("year: " + year);
        System.out.println("isAvailable: " + isAvailable);
        System.out.println("___________________________");
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
