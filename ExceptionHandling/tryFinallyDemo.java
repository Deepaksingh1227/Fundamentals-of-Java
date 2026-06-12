package ExceptionHandling;

public class tryFinallyDemo {
    public static void main(String args[]) {

        try {
            System.out.println("HLO");
            System.exit(0);

        } finally {
            System.out.println("Never executed in this case");
        }
        System.out.println("HLO");

    }

}
