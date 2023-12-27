package VOB10_a1;

import java.util.Arrays;

public class A1_main {

    public static void main(String[] args) {

        Book book1 = new Book("Titel 1" , "Auto 1", "1", 1);
        Book book2 = new Book("Titel 2" , "Auto 2", "2", 2);
        Book book3 = new Book("Titel 3" , "Auto 3", "3", 3);
        Book book4 = new Book("Titel 4" , "Auto 4", "4", 4);

        Library l = new Library();
        l.addBook(book1);
        l.addBook(book2);
        l.addBook(book3);
        l.addBook(book4);

        l.borrowBook("Titel 2");
        l.borrowBook("Titel 4");
        l.borrowBook("Titel 4");
        l.borrowBook("Titel 4");

        l.returnBook("Titel 4");

        l.displayBooks();

    }
}
