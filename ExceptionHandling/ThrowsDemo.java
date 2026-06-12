package ExceptionHandling;

public class ThrowsDemo {
    public class Library {
        int availableBooks = 3;

        public void borrowBook(int bookRequested) throws Exception {
            if (bookRequested > availableBooks) {
                throw new Exception("Not enough books available");
            }
            if (bookRequested < 0) {
                throw new Exception("You must request atleast 1 book ");
            }

        }

    }

    public static void main(String args[]) {
        ThrowsDemo obj = new ThrowsDemo();

        Library l1 = obj.new Library();
        try {
            l1.borrowBook(-1);
        } catch (Exception e) {
            // e.printStackTrace();
            // System.out.println("Exception Occured");
            System.out.println(e.getMessage());
        }

    }

}
