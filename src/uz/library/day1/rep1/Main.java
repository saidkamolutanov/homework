package uz.library.day1.rep1;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("ali aliyev", "aliyev ali", "1", 2010);
        book1.displayInfo();

        Book book2 = new Book("xoji davronov", "davronov xoji", "2", 2012);
        book2.displayInfo();

        Book book3 = new Book("vali aliyev", "aliyev vali", "3", 2013);
        book3.displayInfo();
    }
}
