package uz.library.day2.rep1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Ali aliyev", "aliyev ali", "b9", 2010);

        System.out.println("==== Initial state ====");
        book1.displayInfo();

        System.out.println("--- Borrow book ---");
        book1.borrowBook();
        book1.displayInfo();

        System.out.println("--- Borrow again ---");
        book1.borrowBook();

        System.out.println("--- Return book ---");
        book1.returnBook();
        book1.displayInfo();

        System.out.println("--- Return again ---");
        book1.returnBook();
    }
}
