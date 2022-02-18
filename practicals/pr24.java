package practicals;

public class pr24 {

    public static void main(String[] args) {

        int a = 10;
        double b = 10.5;
        System.out.println("\nInt is " + a + " and double is " + b);
        System.out.print("\n");

        System.out.println("Square of integer is " + square(a) + "\n");

        System.out.println("Square of double is " + square(b) + "\n");
    }

    public static int square(int a) {
        return a * a;
    }

    public static double square(double a) {
        return a * a;
    }
}
