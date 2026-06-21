package uz.library.day2.rep1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("ali aliyev", "aliyev ali", "b9", 2010);
        System.out.println("=== BOOK INFO ===");
        book1.displayInfo();

        System.out.println("=== Borrow test ===");
        book1.borrowBook();

        System.out.println("=== Borrow again ===");
        book1.displayInfo();

        System.out.println("=== Return test ===");
        book1.returnBook();


    }
}
