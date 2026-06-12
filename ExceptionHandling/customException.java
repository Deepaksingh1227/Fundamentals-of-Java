package ExceptionHandling;

class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks = 3;

    public void borrowBook(int bookRequested) throws Exception {
        if (bookRequested > availableBooks) {
            throw new BookUnavailableException("not enough book are there");
        }
    }
}

public class customException {
    public static void main(String args[]) {
        // customException obj = new customException();
        Library l1 = new Library();
        try {
            l1.borrowBook(20);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());

        }

    }

}
