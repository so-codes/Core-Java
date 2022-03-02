package base.excep;

public class try_exc {
    // try and catch exception in try block

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
    }
}
