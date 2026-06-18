package uz.library.day1.rep1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("ali aliyev", "aliyev ali", "1", 2010);
        book1.displayInfo();

        Book book2 = new Book("vali valiev", "vaiyev vali", "2", 2011);
        book2.displayInfo();

        Book book3 = new Book("asad qodiriy", "asad qodiriy", "3", 2014);
        book3.displayInfo();
    }
}
