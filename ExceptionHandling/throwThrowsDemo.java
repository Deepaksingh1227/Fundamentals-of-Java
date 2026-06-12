package ExceptionHandling;

public class throwThrowsDemo {

    public class Library {
        int availableBooks = 3;

        public void borrowBook(int bookRequested) {
            try {
                if (bookRequested > availableBooks) {
                    throw new Exception("Not enough book available ");
                }

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Finally block is Executed");
            }
        }
    }

    public static void main(String args[]) {
        throwThrowsDemo obj = new throwThrowsDemo();
        Library l1 = obj.new Library();
        l1.borrowBook(2);

    }

}
