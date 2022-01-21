package practicals;
import java.util.*;

public class pr4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("\nEnter radius: ");
            int radius = sc.nextInt();

            final double PI = 3.14159;

            double perimeter = 2 * PI * radius;
            double area = PI * radius * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }
    }
}
