package practicals;
import java.util.*;

public class pr4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("\nEnter radius: ");
            int radius = sc.nextInt();

            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }
    }
}
