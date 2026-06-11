package corejava.exceptionHandling.assignments;

public class Library {
    int availableBooks = 3;

    public void borrowBook(int booksRequested){
        try {
            int[] books = {101, 102, 103};
            System.out.println("Book Requested: " + books[booksRequested]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occurred, you requested book that does not exist");
        }finally {
            System.out.println("Finally Block");
        }
    }
}