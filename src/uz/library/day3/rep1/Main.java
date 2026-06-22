package uz.library.day3.rep1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("ali vali", "java", "b9", 1990);
        System.out.println("=== --- Book Info --- ===");
        book1.displayInfo();

        System.out.println("--- Borrow book ---");
        book1.borrowBook();

        System.out.println("--- Borrow again result ---");
        book1.displayInfo();

        System.out.println("--- Return book ---");
        book1.displayInfo();

        System.out.println("--- Return again result ---");
        book1.displayInfo();
    }
}
