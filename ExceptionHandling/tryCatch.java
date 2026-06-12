package ExceptionHandling;

public class tryCatch {
    public static void main(String args[]) {
        int a = 10;

        try {
            // Exception generating statement
            int result = a / 0;
        } catch (ArithmeticException e) {
            // exception handling statement
            System.out.println("number can not divided by zero");

        } catch (IndexOutOfBoundsException e) {
            // exception handling statement
            System.out.println("its Arithmetic Exception");
        }

        System.out.println("value of result is undefine");

    }

}
