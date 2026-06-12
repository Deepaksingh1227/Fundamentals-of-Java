package ExceptionHandling;

public class tryCatch {
    public static void main(String args[]) {
        int a = 10;

        try {
            int result = a / 0;
        } catch (Exception e) {
            System.out.println("number can not divided by zero");

        }

        System.out.println("value of result is undefine");

    }

}
