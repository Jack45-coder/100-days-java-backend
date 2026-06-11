package corejava.exceptionHandling.assignments;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(2);
        System.out.println();
        library.borrowBook(3);
        System.out.println();
        library.borrowBook(0);
    }
}